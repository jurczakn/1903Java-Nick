package com.revature;

import java.util.ArrayList;

public class ErrorDriver {

	public static void main(String[] args) {
		try {
			//throw new Error();
			//recurs();
			//ArrayList<String> strArr = new ArrayList<String>();
			Object[] o = null; 
			int i = 0;
			for(;;){
				System.out.println(i++);
				o = new Object[]{o};
			}
		} catch (Throwable t){
			t.printStackTrace();
			System.out.println("Caught error");
		} finally {
			System.out.println("Inside finally");
		}
	}
	
	public static void recurs(){
		System.out.println("Inside recurs");
		recurs();
	}
	
}
