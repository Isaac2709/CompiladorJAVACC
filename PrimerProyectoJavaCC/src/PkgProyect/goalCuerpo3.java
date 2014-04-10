package PkgProyect;

public class goalCuerpo3 {	
	public MainClassAST mc;
	public TypeDeclarationAST td;
	
	public goalCuerpo3(MainClassAST mc, TypeDeclarationAST td){		
		this.mc=mc;
		this.td=td;
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitGoalCuerpo3(this,arg);
	}
}
