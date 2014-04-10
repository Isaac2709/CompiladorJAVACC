package PkgProyect;

public class mainClassCuerpo {
	public IdentifierAST i1;
	public IdentifierAST i2;
	public PrintStatementAST ps;
	
	public mainClassCuerpo(IdentifierAST i1, IdentifierAST i2, PrintStatementAST ps){
		this.i1=i1;
		this.i2=i2;
		this.ps=ps;
	}
	
	public Object visit(Visitor v,Object arg) {
	       return v.visitMainClassCuerpo(this,arg);
	}
}
