import java.util.ArrayList;
import java.util.List;

/**
 * Created by hugoj on 3/24/2017.
 */
public class ProgramSectionVisitor extends Loom2BaseVisitor<ProgramSection> {


    @Override
    public ProgramSection visitSections(Loom2Parser.SectionsContext ctx) {
        List<Statement> sectionStatements = new ArrayList<>(ctx.statements().size());

        StatementVisitor stmtVisitor = new StatementVisitor();
        for(Loom2Parser.StatementsContext stmtCtx: ctx.statements()){
            Statement stmt = stmtCtx.accept(stmtVisitor);

            if(stmt.wasThereAnError())
                return new ProgramSectionError(stmt.returnErrorMessage());
            else if(!statementInCorrectSection(ctx, stmt))
                return new ProgramSectionError("StatementMismatchException: " + ctx.getStart().getLine());
            else
                sectionStatements.add(stmt);
        }

        return constructSection(sectionStatements, ctx);
    }

    public ProgramSection constructSection(List<Statement> stmts, Loom2Parser.SectionsContext ctx){
        String sectionName = ctx.getStart().getText();

        if(sectionName.equals("PAGE")){
            System.out.print("Constructing page... ");
            return constructPageSection(stmts, ctx);
        }else if(sectionName.equals("CHAPTER")){
            System.out.print("Constructing chapter... ");
            return constructChapterSection(stmts, ctx);
        }else if(sectionName.equals("SECTION")){
            System.out.print("Constructing section... ");
            return constructSectionSection(stmts, ctx);
        }else{
            System.out.println("Constructing story... ");

        }

        return null;
    }

    private ProgramSection constructSectionSection(List<Statement> stmts, Loom2Parser.SectionsContext ctx) {
        Section sec = new Section();

        for(Statement stmt: stmts){
            String stmtType = stmt.getStatementType();

            if(stmtType.equals(Title.TITLE)){
                Title title = (Title) stmt;
                if(sec.getSectionTitle() == null){
                    sec.setSectionTitle(title.getTitleContent());
                    sec.setSectionIdentifier(title.getTitleIdentifier());
                } else
                    return new ProgramSectionError("DuplicateTitleException: " + ctx.getStart().getLine());
            } else if(stmtType.equals(Assignment.ASS)){
                Assignment assign = (Assignment) stmt;
                if(!sec.addVariableAssignment(assign.getAssignmentVariable(), assign.getAssignmentComponentIdString()))
                    return new ProgramSectionError("DuplicateAssignmentException: " + assign.getAssignmentLineNumber());
            }else if(stmtType.equals(Chapt.CHAPT)){
                Chapt chapt = (Chapt) stmt;
                if(!sec.addChapterToSection(chapt.returnChaptTarget(), chapt.startChapter(), chapt.endChapter()))
                    return new ProgramSectionError("DuplicateChapterAssignmentException: " + ctx.getStart().getLine());
            }else if(stmtType.equals(Link.LINK)){
                Link link = (Link) stmt;
                if(sec.definesAsPageOrVariable(link.getLinkChapterSource()) &&
                        sec.definesAsPageOrVariable(link.getLinkChapterTarget()))
                    sec.addLink(link);
            }
        }

        System.out.println("Done!");
        return sec;
    }

    private ProgramSection constructChapterSection(List<Statement> stmts, Loom2Parser.SectionsContext ctx) {
        Chapter ch = new Chapter();

        for(Statement stmt: stmts){
            String stmtType = stmt.getStatementType();

            if(stmtType.equals(Title.TITLE)){
                Title title = (Title) stmt;
                if(ch.getChapterTitle() == null){
                    ch.setChapterTitle(title.getTitleContent());
                    ch.setChapterComponentId(title.getTitleIdentifier());
                } else
                    return new ProgramSectionError("DuplicateTitleException: " + ctx.getStart().getLine());
            } else if(stmtType.equals(Assignment.ASS)){
                Assignment assign = (Assignment) stmt;
                if(!ch.addVariableAssignment(assign.getAssignmentVariable(), assign.getAssignmentComponentIdString()))
                    return new ProgramSectionError("DuplicateAssignmentException: " + assign.getAssignmentLineNumber());
            } else if(stmtType.equals(Pg.PG)){
                Pg page = (Pg) stmt;
                if(!ch.addPage(page.returnPgTarget()))
                    return new ProgramSectionError("DuplicatePageAssignmentException: " + ctx.getStart().getLine());
            } else if(stmtType.equals(Link.LINK)){
                Link link = (Link) stmt;
                String referenceSource = link.getLinkReference().getReferenceSource();


                if(referenceSource.startsWith("$")){
                    if(!ch.inDefinedAsPage(referenceSource))
                        return new ProgramSectionError("UndefinedReferenceLinkException: " + ctx.getStart().getLine());
                }else{
                  if(!ch.isValidVariableName(referenceSource))
                      return new ProgramSectionError("UndefinedReferenceLinkException: " + ctx.getStart().getLine());
                }

                if(link.hasLinkVariableReference()){
                    if(!ch.isValidVariableName(link.getLinkVariableReference()))
                        return new ProgramSectionError("UndefinedReferenceLinkException: " + ctx.getStart().getLine());
                }else{
                    if(!ch.inDefinedAsPage(link.getLinkCompIdReferenceAsString()))
                        return new ProgramSectionError("UndefinedReferenceLinkException: " + ctx.getStart().getLine());
                }

                if(!ch.addLink(link))
                    return new ProgramSectionError("SOMETHING WENT WRONG !!!!");
            }
        }
        if(ch.isComplete()) {
            System.out.println("Done!");
            return ch;
        }
        else
            return new ProgramSectionError("IncompleteChapterException: " + ctx.getStart().getLine());
    }

    public ProgramSection constructPageSection(List<Statement> stmts, Loom2Parser.SectionsContext ctx){
        Page pg = new Page();

        for(Statement stmt : stmts){
            String stmtType = stmt.getStatementType();

            if(stmtType.equals(Title.TITLE)){
                Title title = (Title) stmt;
                if(pg.getPageTitle() == null) {
                    pg.setPageTitle(title.getTitleContent());
                    pg.setPageIdentifer(title.getTitleIdentifier());
                }
                else
                    return new ProgramSectionError("DuplicateTitleException: " + ctx.getStart().getLine());
            } else if(stmtType.equals(Text.TEXT)){
                Text text = (Text) stmt;
                if(pg.getPageText() == null)
                    pg.setPageText(text.getTextString());
                else
                    return new ProgramSectionError("DuplicateTextException: " + ctx.getStart().getLine());
            } else if(stmtType.equals(Option.OPTION)){
                Option option = (Option) stmt;
                pg.addPageOptions(option.getOptionText(), option.getOptionIdentifier());
                if(pg.hasDuplicateIdentifiers())
                    return new ProgramSectionError("DuplicateIdentifierException: " + ctx.getStart().getLine());
            } else if(stmtType.equals(IfStatement.IFSTMT)){
                /* Need something in here! */
            }
        }

        System.out.println("Done!");
        return pg;
    }

    public boolean statementInCorrectSection(Loom2Parser.SectionsContext ctx, Statement stmt){
        String sectionName = ctx.getStart().getText();

        if(sectionName.equals("PAGE"))
            if( stmt instanceof  Title || stmt instanceof Text || stmt instanceof Option || stmt instanceof IfStatement)
                return true;

        if(sectionName.equals("CHAPTER"))
            if( stmt instanceof Title || stmt instanceof Assignment || stmt instanceof Pg || stmt instanceof Link)
                return true;

        if(sectionName.equals("SECTION"))
            if (stmt instanceof Title || stmt instanceof Assignment || stmt instanceof Chapt || stmt instanceof Link)
                return true;

        return false;
    }
}
