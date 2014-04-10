package PkgProyect;

public abstract class PrimaryExpressionAST extends AST{
	public abstract Object visit(Visitor v, Object arg);
}
