package PkgProyect;

public abstract class MessageSendAST extends AST{
	public abstract Object visit(Visitor v, Object arg);
}
