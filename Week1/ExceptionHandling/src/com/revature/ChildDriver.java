package com.revature;

import com.revature.exception.MyException;

public class ChildDriver extends Driver {
	
	@Override
	public void throwsMyException() throws MyException{
		System.out.println("inside child");
	}

}
