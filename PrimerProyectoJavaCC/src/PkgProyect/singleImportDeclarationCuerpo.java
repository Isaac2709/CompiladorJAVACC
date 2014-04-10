package PkgProyect;

public class singleImportDeclarationCuerpo {
	public TypeNameAST tn;
	
	public singleImportDeclarationCuerpo(TypeNameAST tn){
		this.tn=tn;		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitSingleImportDeclarationCuerpo(this,arg);
	}
}
