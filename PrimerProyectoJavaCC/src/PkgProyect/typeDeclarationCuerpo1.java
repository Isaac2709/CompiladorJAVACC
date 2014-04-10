package PkgProyect;

public class typeDeclarationCuerpo1 {
	public ClassDeclarationAST cd;
	
	public typeDeclarationCuerpo1(ClassDeclarationAST cd){
		this.cd=cd;		
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitTypeDeclarationCuerpo1(this,arg);
	}
}
