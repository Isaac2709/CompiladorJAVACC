package PkgProyect;

public class goalCuerpo2 {
	public ImportDeclarationAST id;
	public MainClassAST mc;
	
	
	public goalCuerpo2(ImportDeclarationAST id, MainClassAST mc){
		this.id=id;
		this.mc=mc;
		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitGoalCuerpo2(this,arg);
	}
}
