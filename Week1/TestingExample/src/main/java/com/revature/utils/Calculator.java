package com.revature.utils;

public class Calculator <T extends Number>{
	
	public T add(T x, T y){
		
		Integer result = x.intValue() + y.intValue();
		
		return (T) result;
	}

}
