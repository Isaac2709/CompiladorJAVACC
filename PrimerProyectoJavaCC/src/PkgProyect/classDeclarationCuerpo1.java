package PkgProyect;

public class classDeclarationCuerpo1 {
	public IdentifierAST i;
	public VarDeclarationAST vd;
	public MethodDeclarationAST md;
	
	public classDeclarationCuerpo1(IdentifierAST i, VarDeclarationAST vd, MethodDeclarationAST md){
		this.i=i;
		this.vd=vd;
		this.md=md;
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitClassDeclarationCuerpo1(this,arg);
	}
}
