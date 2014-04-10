package PkgProyect;

public class multipleImportDeclarationCuerpo {
	public TypeNameAST tn;
	
	public multipleImportDeclarationCuerpo(TypeNameAST tn){
		this.tn=tn;		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitMultipleImportDeclarationCuerpo(this,arg);
	}
}
