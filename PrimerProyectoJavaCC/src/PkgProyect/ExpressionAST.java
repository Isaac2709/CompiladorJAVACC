package PkgProyect;

public abstract class ExpressionAST extends AST{
	public abstract Object visit(Visitor v, Object arg);
}
