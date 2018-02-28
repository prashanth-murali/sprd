//  Created by Rajiv Prathapan on 4/30/17.
//  Copyright © 2017 Rajiv Prathapan. All rights reserved.
//  Right To Use for the instructor and the University to build and evaluate the software package
//  @author Rajiv Prathapan mailto: rpratha1@asu.edu
//  @version April 30, 2017
//  Purpose: error handling to stop parsing at the first instance of error
//

package Compiler;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class ErrorHandling extends DefaultErrorStrategy {
	@Override
	public void recover(Parser recognizer, RecognitionException e) {
		// TODO Auto-generated method stub
		throw new RuntimeException(e);
		//super.recover(recognizer, e);
	}

	@Override
	public Token recoverInline(Parser recognizer) throws RecognitionException {
		// TODO Auto-generated method stub
		//return super.recoverInline(recognizer);
		throw new RuntimeException(new InputMismatchException(recognizer));
	}

	@Override
	public void sync(Parser arg0) throws RecognitionException {
		// TODO Auto-generated method stub
		//super.sync(arg0);
		//throw new RuntimeException(new InputMismatchException(arg0));
	}


}
