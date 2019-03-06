package com.revature.oop;

import java.util.Arrays;

public class ArrayFun {
	
	public static void main(String[] args) {
		
		String[] sArr = new String[10];
		sArr[0] = "Whatever String we want";
		
		String[] sArr2 = {"1", "2", "3", "hello", "bye", "some other string", "33", "12"};
		
		int integer = 12;
		
		double doubleValue = 0.0;
		
		float floatLiteral = 23_0_92_30_7_5__20.0999999999999999999999f;
		
		char c = 'c';
		
		//System.out.println(floatLiteral);
		
		//loop(sArr2);
		
		//loop(sArr);
		
		/*for(;;){
			System.out.println(".");
		}*/
		
		int i = 13;
		
		/*do{
			System.out.println(i++);
		} while (i < 12);*/
		//reverseLoop(sArr2);
		//forEachLoop(sArr2);
		intStreamExample();
	}
	
	private static void intStreamExample(){
		
		int[] iArr = {4, 14, 21, 99, 56, 99, 56, 332, 44};
		
		System.out.println("Entire array: " + Arrays.toString(iArr));
		
		int[] evenArr = Arrays.stream(iArr).filter((i) -> {return (i%2==0)?true:false;}).toArray();
		
		System.out.print("Only Evens: ");
		Arrays.stream(evenArr).forEach((i)->{System.out.println(i);});
		
		int numberOfOdds = Arrays.stream(iArr).filter(i->(i%2!=0)).map(i->1).sum();
		
		System.out.println("Number of odds: " + numberOfOdds);
		
		int differenceOfEvensAndOdds = Arrays.stream(iArr).map(i->i%2==0?1:-1).sum();
		
		System.out.println("Difference: " + differenceOfEvensAndOdds);
		
		StringBuilder sb = new StringBuilder("a");
		
		sb.append("a");
		
		String a = "hi";
		String b = "hi";
		System.out.println(a==b);
		
	}
	
	private static void forEachLoop(String[] sArr){
		for(String s : sArr){
			System.out.println(s);
		}
	}
	
	private static void reverseLoop(String[] sArr){
		for(int i = sArr.length - 1;i >= 0 ;i--){
			System.out.println(sArr[i]);
		}
	}
	
	private static void loop(String[] sArr){
		
		String s = "";
		int i = 0;
		for (;;){
			System.out.println(sArr[i]);
			if ("2".equals(sArr[i])){
				//break;
				i++;
				continue;
			}
			s += sArr[i];
			System.out.println(s);
			i++;
			if ( i < sArr.length){
				break;
			}
		}
		
	}

}
