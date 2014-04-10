package PkgProyect;

public abstract class ExpressionRestAST extends AST{
	public abstract Object visit(Visitor v, Object arg);
}
