package PkgProyect;

public class importDeclarationCuerpo2 {
	public MultipleImportDeclarationAST mi;
	
	public importDeclarationCuerpo2(MultipleImportDeclarationAST mi){
		this.mi=mi;		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitImportDeclarationCuerpo2(this,arg);
	}
}
