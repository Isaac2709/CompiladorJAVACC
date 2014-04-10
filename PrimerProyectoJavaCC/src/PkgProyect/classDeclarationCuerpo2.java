package PkgProyect;

public class classDeclarationCuerpo2 {
	public IdentifierAST i;
	public VarDeclarationAST vd;
	
	
	public classDeclarationCuerpo2(IdentifierAST i, VarDeclarationAST vd){
		this.i=i;
		this.vd=vd;		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitClassDeclarationCuerpo2(this,arg);
	}
}
