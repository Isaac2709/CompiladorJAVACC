package PkgProyect;

public class typeDeclarationCuerpo2 {
	public ClassExtendsDeclarationAST ced;
	
	public typeDeclarationCuerpo2(ClassExtendsDeclarationAST ced){
		this.ced=ced;		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitTypeDeclarationCuerpo2(this,arg);
	}
}
