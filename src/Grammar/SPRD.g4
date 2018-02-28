/*
The grammar of the language.
*/

grammar SPRD;

options {  
  language = Java; 
} 
@parser::header { 
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
}
@lexer::header { 
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
}

@members {
    private ArrayList<String> variableNames = new ArrayList<String>();
	private Map<String, String> variableType = new HashMap<String, String>();
   
    private boolean variableDefined(String name){
    	//System.out.println(v ariableNames);
    	//System.out.println(variableType);
    	
    		boolean doesContain = variableNames.contains(name);
    		return doesContain;
    		
    }

    private void defineVariable(String name,String type){
        variableNames.add(name);
        variableType.put(name,type);
    }
    
    private boolean isBooleanVariable(String name){
    	String type = variableType.get(name);
    	return type.equals("bool");
    }
}

/* #REGION PARSING RULES */

/* root node */
begin : program;

/* all possible constructs of a program */
program : (intDeclaration | boolDeclaration | intAssignment | boolAssignment | whileLoopConstruct | ifElseConstruct | printFunc)*;
/* Comparison Rules*/

compareInteger : expr INTEGERCOMPARISION expr ;
compareBoolean : bExpr BOOLEANCOMP bExpr;
comparisionExpr : (compareInteger | compareBoolean);

/* Boolean expression */

bExpr : (bTerm) (bSubExpr)*;

bSubExpr : OR bTerm ;

bTerm : (bFactor) (subBTerm)*;

subBTerm : AND bFactor;

bFactor : (  IDENTIFIER {isBooleanVariable($IDENTIFIER.text)}? | BOOL | '(' bExpr ')');


/* Integer expression */

expr : (term)(subExpr)* ;

subExpr : PRIORITYTWOOP term ;

term : (factor) (subTerm)*;

subTerm : PRIORITYONEOP factor;

factor : ( IDENTIFIER  {!isBooleanVariable($IDENTIFIER.text)}? | INTEGER | '(' expr ')');


/* Assignment */

intDeclaration : 'int' IDENTIFIER ('=' (expr | scanFunc) )*
				 {!variableDefined($IDENTIFIER.text)}?
				 {defineVariable($IDENTIFIER.text,"int");};
				 
boolDeclaration : 'bool' IDENTIFIER ('=' (bExpr | scanFunc) )*
				 {!variableDefined($IDENTIFIER.text)}?
				 {defineVariable($IDENTIFIER.text,"bool");};
				 
intAssignment : IDENTIFIER '=' (expr | scanFunc)
				{variableDefined($IDENTIFIER.text)}?
				{!isBooleanVariable($IDENTIFIER.text)}?;
boolAssignment : IDENTIFIER '=' (bExpr|scanFunc)
				{variableDefined($IDENTIFIER.text)}?
				{isBooleanVariable($IDENTIFIER.text)}?;
				
/* Loop */
whileLoopConstruct : whileCond '{' loopBody '}' ;

whileCond : WHILE '(' comparisionExpr ')';

loopBody : (intDeclaration | boolDeclaration | intAssignment | boolAssignment | whileLoopConstruct | ifElseConstruct | printFunc)*;

/* if else statement*/

ifElseConstruct : (ifStatement) (elseStatement)?;

ifStatement : ifCond '{' ifBody '}';

ifCond : IF '(' (comparisionExpr) ')'  ;

ifBody : (intDeclaration | boolDeclaration | intAssignment | boolAssignment | whileLoopConstruct | ifElseConstruct | printFunc)*;

elseStatement : ELSE '{' elseBody '}';

elseBody :  (intDeclaration | boolDeclaration | intAssignment | boolAssignment | whileLoopConstruct | ifElseConstruct | printFunc)*;

/* Print Function */

printFunc : 'print' (INTEGER|BOOL|IDENTIFIER) (',' (INTEGER|BOOL|IDENTIFIER))* ;

scanFunc : 'Get';

/* #REGION LEXICAL RULES */

BOOLEANCOMP : IS;

IS : 'is';
IF :'if';
ELSE:'else';
WHILE :'while';

//boolean data type.
BOOL : ('True' | 'False') ;

//integer data type.
INTEGER : [0-9]+ ;
	
//Identifiers are composed of either alphabets or numbers.
IDENTIFIER: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;


//white spaces are ignored.
WHITESPACE: [ \t\r\n]+ -> skip;

//comments are ignored.
COMMENT : '//' ~( '\r' | '\n' )* -> skip;

/*Operators*/


PRIORITYONEOP : ('*' | '/' | '%');

PRIORITYTWOOP : ('+' | '-') ; 

INTEGERCOMPARISION : ('>' | '<' | '==' | '<=' | '>=' | '!=');

AND : '&&';

OR : '||';






/* #ENDREGION LEXICAL RULES */