//  Created by Prashanth Murali on 4/30/17.
//  Copyright © 2017 Prashanth Murali. All rights reserved.
//  Right To Use for the instructor and the University to build and evaluate the software package
//  @author Prashanth Murali mailto: pmural10@asu.edu
//  @version April 30, 2017
//  Purpose: Implements the SPRDListener interface
//

package Compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Grammar.SPRDListener;
import Grammar.SPRDParser;

import java.util.ArrayList;
import java.util.Stack;

import static java.lang.Boolean.TRUE;

/*
Implementation of Listener Interface to generate intermediate code.
Attributes:
* iCode: The intermediate code as an Arraylist
* lineCountAtWhileStart : an integer stack to keep track of the line number at the while condition.
* lineCountAtWhileExit : an integer stack to keep track of the line number at the end of while loop.
* ifElseCounter : an integer stack to handle nested if else statements.
* lineCountAtIfElseEnd : an integer stack to keep track of the line number at the end of an if-else block.
* lineCountAtIfExit : an integer stack to keep track of the line number at the exit of an if statement.
* lineCount : integer variable to keep track of line number.
*/

public class ImplementListener implements SPRDListener {

    ArrayList<String> iCode = new ArrayList();
    Stack<Integer> lineCountAtWhileStart = new Stack();
    Stack<Integer> lineCountAtWhileExit = new Stack();
    Stack<Integer> ifElseCounter = new Stack();
    Stack<Integer> lineCountAtIfElseEnd = new Stack();
    Stack<Integer> lineCountAtIfExit = new Stack();
    int lineCount = 1;

    @Override
    public void enterBegin(SPRDParser.BeginContext ctx) {
    	
    }

    @Override
    public void exitBegin(SPRDParser.BeginContext ctx) {

    	
    }

    @Override
    public void enterProgram(SPRDParser.ProgramContext ctx) {

    	iCode.add("BEGIN");
    }

    @Override
    public void exitProgram(SPRDParser.ProgramContext ctx) {
        iCode.add("END");
    }

    @Override
    public void enterCompareInteger(SPRDParser.CompareIntegerContext ctx) {

    }

    @Override
    public void exitCompareInteger(SPRDParser.CompareIntegerContext ctx) {

        switch(ctx.INTEGERCOMPARISION().toString()){

            case ">":
                lineCount++;
                iCode.add("GREATER");
                break;

            case "<":
                lineCount++;
                iCode.add("LESSER");
                break;

            case ">=":
                lineCount++;
                iCode.add("GREATEROREQUAL");
                break;

            case "<=":
                lineCount++;
                iCode.add("LESSEROREQUAL");
                break;

            case "==":
                lineCount++;
                iCode.add("EQUALS");
                break;
			
	    case "!=":
            	lineCount++;
            	iCode.add("NOTEQUALS");
            	break;
        }
    }

    @Override
    public void enterCompareBoolean(SPRDParser.CompareBooleanContext ctx) {

    }

    @Override
    public void exitCompareBoolean(SPRDParser.CompareBooleanContext ctx) {
        lineCount++;
        iCode.add("EQUALS");
    }

    @Override
    public void enterComparisionExpr(SPRDParser.ComparisionExprContext ctx) {

    }

    @Override
    public void exitComparisionExpr(SPRDParser.ComparisionExprContext ctx) {

    }

    @Override
    public void enterBExpr(SPRDParser.BExprContext ctx) {

    }

    @Override
    public void exitBExpr(SPRDParser.BExprContext ctx) {

    }

    @Override
    public void enterBSubExpr(SPRDParser.BSubExprContext ctx) {

    }

    @Override
    public void exitBSubExpr(SPRDParser.BSubExprContext ctx) {
        if(ctx.OR()!=null)
        {
            lineCount++;
            iCode.add("OR");
        }

    }

    @Override
    public void enterBTerm(SPRDParser.BTermContext ctx) {

    }

    @Override
    public void exitBTerm(SPRDParser.BTermContext ctx) {

    }

    @Override
    public void enterSubBTerm(SPRDParser.SubBTermContext ctx) {

    }

    @Override
    public void exitSubBTerm(SPRDParser.SubBTermContext ctx) {
        if(ctx.AND()!=null)
        {
            lineCount++;
            iCode.add("AND");
        }

    }

    @Override
    public void enterBFactor(SPRDParser.BFactorContext ctx) {
        if(ctx.IDENTIFIER()!=null)
        {
            lineCount++;
            iCode.add("WRITE "+ctx.IDENTIFIER());
        }
        else if(ctx.BOOL()!=null){
            lineCount++;
            iCode.add("WRITE "+ctx.BOOL());
        }
    }

    @Override
    public void exitBFactor(SPRDParser.BFactorContext ctx) {

    }

    @Override
    public void enterExpr(SPRDParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(SPRDParser.ExprContext ctx) {

    }

    @Override
    public void enterSubExpr(SPRDParser.SubExprContext ctx) {


    }

    public String AddorSub(SPRDParser.SubExprContext ctx)
    {
        String a="";
        switch(ctx.PRIORITYTWOOP().toString()){

            case "+":
                a="ADD";
                break;
            case "-":
                a="SUBTRACT";
                break;
        }
        return a;
    }


    public String MulModDiv(SPRDParser.SubTermContext ctx)
    {
        String a="";
        switch(ctx.PRIORITYONEOP().toString())
        {
            case "*":
                a="MULTIPLY";
                break;
            case "/":
                a="DIVIDE";
                break;
            case "%":
                a="MODULUS";
                break;
        }
        return a;
    }

    @Override
    public void exitSubExpr(SPRDParser.SubExprContext ctx) {

        lineCount++;
        iCode.add(AddorSub(ctx));
    }

    @Override
    public void enterTerm(SPRDParser.TermContext ctx) {

    }

    @Override
    public void exitTerm(SPRDParser.TermContext ctx) {

    }

    @Override
    public void enterSubTerm(SPRDParser.SubTermContext ctx) {

    }

    @Override
    public void exitSubTerm(SPRDParser.SubTermContext ctx) {

        lineCount++;
        iCode.add(MulModDiv(ctx));
    }

    @Override
    public void enterFactor(SPRDParser.FactorContext ctx) {

        if(ctx.IDENTIFIER()!=null){
            lineCount++;
            iCode.add("WRITE "+ctx.IDENTIFIER());
        }

        else if (ctx.INTEGER()!=null){
            lineCount++;
            iCode.add("WRITE "+ctx.INTEGER());
        }
    }

    @Override
    public void exitFactor(SPRDParser.FactorContext ctx) {

    }

    @Override
    public void enterIntDeclaration(SPRDParser.IntDeclarationContext ctx) {

    }

    @Override
    public void exitIntDeclaration(SPRDParser.IntDeclarationContext ctx) {

        lineCount++;
        iCode.add("SAVEINT "+ctx.IDENTIFIER());
    }

    @Override
    public void enterBoolDeclaration(SPRDParser.BoolDeclarationContext ctx) {

    }

    @Override
    public void exitBoolDeclaration(SPRDParser.BoolDeclarationContext ctx) {

        lineCount++;
        iCode.add("SAVEBOOL "+ctx.IDENTIFIER());
    }

    @Override
    public void enterIntAssignment(SPRDParser.IntAssignmentContext ctx) {


    }

    @Override
    public void exitIntAssignment(SPRDParser.IntAssignmentContext ctx) {

    	lineCount++;
        iCode.add("SAVEINT "+ctx.IDENTIFIER());
    }

    @Override
    public void enterBoolAssignment(SPRDParser.BoolAssignmentContext ctx) {

    }

    @Override
    public void exitBoolAssignment(SPRDParser.BoolAssignmentContext ctx) {

        lineCount++;
        iCode.add("SAVEBOOL "+ctx.IDENTIFIER());
    }

    @Override
    public void enterWhileLoopConstruct(SPRDParser.WhileLoopConstructContext ctx) {

        lineCountAtWhileStart.push(lineCount);
    }

    @Override
    public void exitWhileLoopConstruct(SPRDParser.WhileLoopConstructContext ctx) {

        lineCount++;
        iCode.add("WRITE TRUE");
        Integer index=lineCountAtWhileStart.pop()+1;
        String value=""+index;
        iCode.add("IFTRUEGOTO "+value);
        index=lineCountAtWhileExit.pop();
        value=iCode.get(index);
        value+=" "+(lineCount+2);
        iCode.set(index,value);
        lineCount++;
    }

    @Override
    public void enterWhileCond(SPRDParser.WhileCondContext ctx) {

    }

    @Override
    public void exitWhileCond(SPRDParser.WhileCondContext ctx) {

        lineCountAtWhileExit.push(lineCount);
        iCode.add("IFFALSEGOTO");
        lineCount++;
    }

    @Override
    public void enterLoopBody(SPRDParser.LoopBodyContext ctx) {

    }

    @Override
    public void exitLoopBody(SPRDParser.LoopBodyContext ctx) {

    }

    @Override
    public void enterIfElseConstruct(SPRDParser.IfElseConstructContext ctx) {

    }

    @Override
    public void exitIfElseConstruct(SPRDParser.IfElseConstructContext ctx) {

        int counter=ifElseCounter.pop();
        for(int i=0;i<counter;i++)
        {
            Integer index=lineCountAtIfElseEnd.pop();
            String value=iCode.get(index);
            value+=" "+(lineCount+1);
            iCode.set(index,value);
        }
    }

    @Override
    public void enterIfStatement(SPRDParser.IfStatementContext ctx) {

        ifElseCounter.push(1);
    }

    @Override
    public void exitIfStatement(SPRDParser.IfStatementContext ctx) {

        lineCount++;
        iCode.add("WRITE TRUE");
        iCode.add("IFTRUEGOTO");
        lineCountAtIfElseEnd.add(lineCount);
        Integer index=lineCountAtIfExit.pop();
        String value=iCode.get(index);
        value +=" "+(lineCount+2);
        iCode.set(index,value);
        lineCount++;
    }

    @Override
    public void enterIfCond(SPRDParser.IfCondContext ctx) {

    }

    @Override
    public void exitIfCond(SPRDParser.IfCondContext ctx) {

        iCode.add("IFFALSEGOTO");
        lineCountAtIfExit.push(lineCount);
        lineCount++;
    }

    @Override
    public void enterIfBody(SPRDParser.IfBodyContext ctx) {

    }

    @Override
    public void exitIfBody(SPRDParser.IfBodyContext ctx) {

    }

    @Override
    public void enterElseStatement(SPRDParser.ElseStatementContext ctx) {

    }

    @Override
    public void exitElseStatement(SPRDParser.ElseStatementContext ctx) {


    }

    @Override
    public void enterElseBody(SPRDParser.ElseBodyContext ctx) {

    }

    @Override
    public void exitElseBody(SPRDParser.ElseBodyContext ctx) {

    }

    @Override
    public void enterPrintFunc(SPRDParser.PrintFuncContext ctx) {

    }

    @Override
    public void exitPrintFunc(SPRDParser.PrintFuncContext ctx) {

    	
		if(!ctx.INTEGER().isEmpty()) {
			iCode.add("PRINT " + ctx.INTEGER().toString());
			lineCount++;
		}
		if(!ctx.BOOL().isEmpty()){
			iCode.add("PRINT " + ctx.BOOL().toString());
			lineCount++;
		}
		if(!ctx.IDENTIFIER().isEmpty()) {
			iCode.add("PRINT " + ctx.IDENTIFIER().toString());
			lineCount++;
		}
    }

    @Override
    public void enterScanFunc(SPRDParser.ScanFuncContext ctx)
    {


    }

    @Override
    public void exitScanFunc(SPRDParser.ScanFuncContext ctx)
    {
       lineCount++;
       iCode.add("GET ");
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
