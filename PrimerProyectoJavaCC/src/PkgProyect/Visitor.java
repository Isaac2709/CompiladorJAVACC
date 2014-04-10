package PkgProyect;
public interface Visitor
{
// POR CADA CLASE CONCRETA DEL ÁRBOL, UN METODO PARA VISITARLO.
  public Object visitGoalCuerpo1(goalCuerpo1 c, Object arg);
  public Object visitGoalCuerpo2(goalCuerpo2 c, Object arg);
  public Object visitGoalCuerpo3(goalCuerpo3 c, Object arg);
  public Object visitImportDeclarationCuerpo1(importDeclarationCuerpo1 c, Object arg);
  public Object visitImportDeclarationCuerpo2(importDeclarationCuerpo2 c, Object arg);
  public Object visitSingleImportDeclarationCuerpo(singleImportDeclarationCuerpo c, Object arg);
  public Object visitMultipleImportDeclarationCuerpo(multipleImportDeclarationCuerpo c, Object arg);
  public Object visitMainClassCuerpo(mainClassCuerpo c, Object arg);
  public Object visitTypeDeclarationCuerpo1(typeDeclarationCuerpo1 c, Object arg);
  public Object visitTypeDeclarationCuerpo2(typeDeclarationCuerpo2 c, Object arg);
  public Object visitClassDeclarationCuerpo1(classDeclarationCuerpo1 c, Object arg);
  public Object visitClassDeclarationCuerpo2(classDeclarationCuerpo2 c, Object arg);
  public Object visitClassDeclarationCuerpo3(classDeclarationCuerpo3 c, Object arg);
  
  /*public Object visitunadeclAST( unadeclAST c, Object arg);
  public Object visitvariasdeclsAST( variasdeclsAST c, Object arg);
  public Object visitintdeclAST( intdeclAST c, Object arg);
  public Object visitsindeclAST( sindeclAST c, Object arg);
  public Object visitstrdeclAST( strdeclAST c, Object arg);
  public Object visitunIDAST( unIDAST c, Object arg);
  public Object visitvariosIDAST( variosIDAST c, Object arg);
  public Object visitIDexprAST( IDexprAST c, Object arg);
  public Object visitNUMexprAST( NUMexprAST c, Object arg);
  public Object visitSTRexprAST( STRexprAST c, Object arg);
  public Object visitassignstatAST( assignstatAST c, Object arg);
  public Object visitunstatsAST( unstatsAST c, Object arg);
  public Object visitvariosstatsAST( variosstatsAST c, Object arg);
  public Object visitexprstatAST( exprstatAST c, Object arg);
  public Object visittermexprAST( termexprAST c, Object arg);
  public Object visitsumaexprAST( sumaexprAST c, Object arg);
  public Object visitfactortermAST( factortermAST c, Object arg);
  public Object visitmulttermAST( multtermAST c, Object arg);
  public Object visitexprfactorAST( exprfactorAST c, Object arg);
*/
}
