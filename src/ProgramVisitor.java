/**
 * Created by hugoj on 3/24/2017.
 */
public class ProgramVisitor extends Loom2BaseVisitor<Program> {

    @Override
    public Program visitProgram(Loom2Parser.ProgramContext ctx) {

        ProgramSectionVisitor sectVisitor = new ProgramSectionVisitor();
        for(Loom2Parser.SectionsContext secCtx: ctx.sections()){
            ProgramSection sec = secCtx.accept(sectVisitor);

            if(sec.wasThereAnError())
                return new Program(sec.returnErrorMessage());
        }

        return null;
    }
}
