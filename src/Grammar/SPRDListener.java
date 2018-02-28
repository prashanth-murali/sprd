// Generated from SPRD.g4 by ANTLR 4.4
package Grammar;
 
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SPRDParser}.
 */
public interface SPRDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SPRDParser#compareInteger}.
	 * @param ctx the parse tree
	 */
	void enterCompareInteger(@NotNull SPRDParser.CompareIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#compareInteger}.
	 * @param ctx the parse tree
	 */
	void exitCompareInteger(@NotNull SPRDParser.CompareIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#whileCond}.
	 * @param ctx the parse tree
	 */
	void enterWhileCond(@NotNull SPRDParser.WhileCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#whileCond}.
	 * @param ctx the parse tree
	 */
	void exitWhileCond(@NotNull SPRDParser.WhileCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#scanFunc}.
	 * @param ctx the parse tree
	 */
	void enterScanFunc(@NotNull SPRDParser.ScanFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#scanFunc}.
	 * @param ctx the parse tree
	 */
	void exitScanFunc(@NotNull SPRDParser.ScanFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#bFactor}.
	 * @param ctx the parse tree
	 */
	void enterBFactor(@NotNull SPRDParser.BFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#bFactor}.
	 * @param ctx the parse tree
	 */
	void exitBFactor(@NotNull SPRDParser.BFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SPRDParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SPRDParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(@NotNull SPRDParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(@NotNull SPRDParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#intDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(@NotNull SPRDParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#intDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(@NotNull SPRDParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(@NotNull SPRDParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(@NotNull SPRDParser.PrintFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#comparisionExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisionExpr(@NotNull SPRDParser.ComparisionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#comparisionExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisionExpr(@NotNull SPRDParser.ComparisionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#bSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterBSubExpr(@NotNull SPRDParser.BSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#bSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitBSubExpr(@NotNull SPRDParser.BSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void enterElseBody(@NotNull SPRDParser.ElseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void exitElseBody(@NotNull SPRDParser.ElseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SPRDParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SPRDParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull SPRDParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull SPRDParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#boolDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclaration(@NotNull SPRDParser.BoolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#boolDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclaration(@NotNull SPRDParser.BoolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull SPRDParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull SPRDParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#whileLoopConstruct}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopConstruct(@NotNull SPRDParser.WhileLoopConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#whileLoopConstruct}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopConstruct(@NotNull SPRDParser.WhileLoopConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(@NotNull SPRDParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(@NotNull SPRDParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#boolAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssignment(@NotNull SPRDParser.BoolAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#boolAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssignment(@NotNull SPRDParser.BoolAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#bTerm}.
	 * @param ctx the parse tree
	 */
	void enterBTerm(@NotNull SPRDParser.BTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#bTerm}.
	 * @param ctx the parse tree
	 */
	void exitBTerm(@NotNull SPRDParser.BTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#ifElseConstruct}.
	 * @param ctx the parse tree
	 */
	void enterIfElseConstruct(@NotNull SPRDParser.IfElseConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#ifElseConstruct}.
	 * @param ctx the parse tree
	 */
	void exitIfElseConstruct(@NotNull SPRDParser.IfElseConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#subBTerm}.
	 * @param ctx the parse tree
	 */
	void enterSubBTerm(@NotNull SPRDParser.SubBTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#subBTerm}.
	 * @param ctx the parse tree
	 */
	void exitSubBTerm(@NotNull SPRDParser.SubBTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull SPRDParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull SPRDParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#subTerm}.
	 * @param ctx the parse tree
	 */
	void enterSubTerm(@NotNull SPRDParser.SubTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#subTerm}.
	 * @param ctx the parse tree
	 */
	void exitSubTerm(@NotNull SPRDParser.SubTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignment(@NotNull SPRDParser.IntAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignment(@NotNull SPRDParser.IntAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void enterBExpr(@NotNull SPRDParser.BExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void exitBExpr(@NotNull SPRDParser.BExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(@NotNull SPRDParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(@NotNull SPRDParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void enterIfCond(@NotNull SPRDParser.IfCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void exitIfCond(@NotNull SPRDParser.IfCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(@NotNull SPRDParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(@NotNull SPRDParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(@NotNull SPRDParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(@NotNull SPRDParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPRDParser#compareBoolean}.
	 * @param ctx the parse tree
	 */
	void enterCompareBoolean(@NotNull SPRDParser.CompareBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPRDParser#compareBoolean}.
	 * @param ctx the parse tree
	 */
	void exitCompareBoolean(@NotNull SPRDParser.CompareBooleanContext ctx);
}