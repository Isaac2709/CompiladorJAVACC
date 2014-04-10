package PkgProyect;

public class classDeclarationCuerpo3 {
	public IdentifierAST i;	
	public MethodDeclarationAST md;
	
	public classDeclarationCuerpo3(IdentifierAST i, MethodDeclarationAST md){
		this.i=i;		
		this.md=md;
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitClassDeclarationCuerpo3(this,arg);
	}
}
