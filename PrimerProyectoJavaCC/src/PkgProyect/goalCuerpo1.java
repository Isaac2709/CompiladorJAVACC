package PkgProyect;

public class goalCuerpo1 extends GoalAST{
	public ImportDeclarationAST id;
	public MainClassAST mc;
	public TypeDeclarationAST td;
	
	public goalCuerpo1(ImportDeclarationAST id, MainClassAST mc, TypeDeclarationAST td){
		this.id=id;
		this.mc=mc;
		this.td=td;
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitGoalCuerpo1(this,arg);
	}
}
