/**
 * Created by hugoj on 3/24/2017.
 */
public class ProgramVisitor extends Loom2BaseVisitor<Program> {

    @Override
    public Program visitProgram(Loom2Parser.ProgramContext ctx) {
        Program prog = new Program();
        ProgramSectionVisitor sectVisitor = new ProgramSectionVisitor();
        for(Loom2Parser.SectionsContext secCtx: ctx.sections()){
            ProgramSection sec = secCtx.accept(sectVisitor);

            if(sec.wasThereAnError())
                return new Program(sec.returnErrorMessage());
            else{
                String errorMessage = prog.addNewSection(sec);
                if(errorMessage != null)
                    return new Program(errorMessage);
            }
        }

        String result = prog.verifyReferences();
        if(result == null)
            return prog;
        else
            return new Program(result);
    }
}
