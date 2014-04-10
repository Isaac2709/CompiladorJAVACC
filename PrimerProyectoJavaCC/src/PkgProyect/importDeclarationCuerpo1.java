package PkgProyect;

public class importDeclarationCuerpo1 {
	public SingleImportDeclarationAST si;
	
	public importDeclarationCuerpo1(SingleImportDeclarationAST si){
		this.si=si;		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitImportDeclarationCuerpo1(this,arg);
	}
}
