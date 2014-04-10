package PkgProyect;

public abstract class StatementAST extends AST{
	public abstract Object visit(Visitor v, Object arg);
}
