package com.revature;

import com.revature.exception.MyException;

public class Driver {

	public static void main(String[] args) throws Throwable {
		
		System.out.println(new Driver().callsException());
		
		/*try{
			//throwingMethod();
			Driver driver = new ChildDriver();
			driver.throwsMyException();
			new Driver().throwsMyException();
			System.out.println("Everything is fine");
			return;
		} catch (MyException e) {
			System.out.println("Throws my exception");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("The end");
		}*/
		//throw new RuntimeException();

	}
	
	private static void throwingMethod(){
		throw new RuntimeException();
	}
	
	public void throwsMyException() throws Exception{
		/*if(Math.random()>0.5){
			throw new MyException();
		}*/
	}
	
	public String callsException(){
		try{
			throwsMyException();
			System.out.println("Still inside try");
			return "Inside try";
		} finally {
			return "Inside Finally";
		}
	}

}
