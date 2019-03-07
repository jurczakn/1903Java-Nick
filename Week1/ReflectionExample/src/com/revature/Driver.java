package com.revature;

import java.lang.reflect.Field;

//Reflection - Java's ability to look into it's own code at runtime.  
//One of Java's most powerful features.
public class Driver {
	
	public static void main(String[] args) {
		
		String var = "Foo";
		
		System.out.println("Initial contents: " + var);
		
		Class<String> string = String.class;
		
		FinalField var2 = new FinalField();
		
		Class<FinalField> finalField = FinalField.class;
		
		try {
			Field field2 = finalField.getDeclaredField("value");
			Field field = string.getDeclaredField("value");
			field2.setAccessible(true);
			field.setAccessible(true);
			field.set(var, "Different".toCharArray());
			field2.set(var2, "Has Changed");
			System.out.println("New contents: " + var);
			System.out.println("Foo");
			System.out.println("Food");
			System.out.println(var2.value);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}	
	
	public static void myMethod(){}

}
