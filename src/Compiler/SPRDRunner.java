//  Created by Dipak Purbey on 4/30/17.
//  Copyright © 2017 Dipak Purbey. All rights reserved.
//  Right To Use for the instructor and the University to build and evaluate the software package
//  @author Dipak Purbey mailto: dpurbey@asu.edu
//  @version April 30, 2017
//  Purpose: To generate intermediate code and abstract syntax tree
//
package Compiler;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import Grammar.SPRDLexer;
import Grammar.SPRDParser;



public class SPRDRunner {
	
	public static void main(String[] args){
		
		try{
			FileInputStream inputFileStream = new FileInputStream(args[0]);
			// for testing purpose
			// ANTLRInputStream input = new ANTLRInputStream("int a = 0 int b = 1 int i=0 int n = 5 if(n == 1){print 0 print 1 a=1}else{print n n=6 print a}while(i < n - 2){int c = a + b a = b b = c i = i + 1}");
			ANTLRInputStream input = new ANTLRInputStream(inputFileStream);
			
			SPRDLexer lexer = new SPRDLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			SPRDParser parser = new SPRDParser(tokens);
			parser.setErrorHandler(new ErrorHandling());
			
			ParserRuleContext parseTree = parser.begin();
			
			//show AST in GUI 
	        JFrame frame = new JFrame("SPRD AST");
	        JPanel panel = new JPanel();
	        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),parseTree);
	        viewr.setScale(1.5);//scale a little
	        panel.add(viewr);
	        frame.add(panel);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(200,200);
	        frame.setVisible(true);
	        
	        // walk through the parse tree
	        ParseTreeWalker treeWalker = new ParseTreeWalker();
			ImplementListener listener = new ImplementListener();
			treeWalker.walk(listener, parseTree);
			
			// generate the intermediate code
			PrintWriter intermediateCodeWriter = new PrintWriter(args[0].split(".sprd")[0]+".isprd", "UTF-8");
			for (int i=0; i< listener.iCode.size(); i++){
				intermediateCodeWriter.println(listener.iCode.get(i));
			}
			intermediateCodeWriter.close();
			
		} catch (Exception ex){
			System.out.println(ex);
		}
		
	}
	
}
