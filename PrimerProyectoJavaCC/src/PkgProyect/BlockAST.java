package PkgProyect;

public abstract class BlockAST extends AST{
	public abstract Object visit(Visitor v, Object arg);
}
