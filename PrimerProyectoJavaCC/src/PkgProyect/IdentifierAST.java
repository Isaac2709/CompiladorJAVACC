package PkgProyect;

public abstract class IdentifierAST extends AST{
	public abstract Object visit(Visitor v, Object arg);
}
