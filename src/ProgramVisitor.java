/**
 * Created by hugoj on 3/24/2017.
 */
public class ProgramVisitor extends Loom2BaseVisitor<Program> {

    @Override
    public Program visitProgram(Loom2Parser.ProgramContext ctx) {

        SectionVisitor sectVisitor = new SectionVisitor();
        for(Loom2Parser.SectionsContext secCtx: ctx.sections()){
            Section sec = secCtx.accept(sectVisitor);

            if(sec.wasThereAnError())
                return new Program(sec.returnErrorMessage());
        }

        return null;
    }
}
