package com.revature.oop;

public class Wrappers {
	/*
	 * Wrapper classes are class representation of primitive values
	 * There is a wrapper class for every primitive
	 * They allow us to treat primitive as classes and vice a versa
	 * AutoBoxing - Java automatically turns a primitive into the wrapper class
	 * version when it expects a class;
	 * AutoUnBoxing - Java automatically turns the wrapper class and turning it into
	 * the primitive value when a primitive is expected
	 */
	public static void main(String[] args) {
		
		Integer integer = new Integer(5);
		Float myFloat = new Float(0.0f);
		Character myCharacter = new Character('a');
		Byte myByte = new Byte((byte) 1);
		Double myDouble = new Double(0.0);
		Long myLong = new Long(6l);
		Boolean myBloolean = new Boolean(true);
		Short myShort = new Short((short) 7);

		int i = 1;
		float f = 1f;
		char c = 1;
		byte b = 1;
		double d = 1.0;
		long l = 1;
		boolean bool = true;
		short s = 1;
		short s2 = 3;
		
		//s = s + s2;
		
		//i = myLong + myShort;
		
		
		integer = i;
		i = integer;
		takeObject(i);
		
		takeInt(s);
		takeInt(integer);
		takeInteger(i);
		
		System.out.println(myLong + myShort - d);
		
		takeIntInteger(integer, i);
		
		takeIntInteger(i, integer);
		
		//takeIntInteger(i, i); ambiguous
		
		takeIntInteger(s, i);
		
		takeIntInteger(i, i);
		
	}
	
	//                                 vvv--- var args or variable lenght arguments
	private static void takeIntInteger(int... i){
		System.out.println("inside var args int");
	}
	
	private static void takeIntInteger(Integer integer, int i){
		System.out.println("inside Integer int");
	}
	
	private static void takeIntInteger(int i, Integer integer){
		System.out.println("inside int integer");
	}
	
	private static void takeInt(int i){
		System.out.println(i);
	}
	
	private static void takeInteger(Integer i){
		System.out.println(i);
	}
	
	private static void takeObject(Object o){
		System.out.println(o.toString());
	}

}
