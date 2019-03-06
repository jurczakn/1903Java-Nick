package com.revature.oop;

public class Scopes {
	
	static int staticInt = 10;
	
	public int instanceInt = 11;
	
	//                               vvvv-----also inside method scope(method scope is also parameter scope
	public static void main(String[] args) {
	
		System.out.println(staticInt);
		
		
		//System.out.println(instanceInt); cannot access instance variables or methods inside a static context
		
		int j = 9;//method scope = available throughout the method
		
		if(true){
			System.out.println(j);
			int h = 7;//local scope
		}
		
		{ int l = 12; }//block scope is another name for local scope
		//System.out.println(l); also local scope
		//System.out.println(h); h is unaccessible here
		int l = 12;
		
		for(int i = 0; i == 0;i++){
			//i is in loop scope, same as block and local scope
		}
		
		Scopes scope = new Scopes();
		
		scope.doStuff();
		
		//doStuff(); cannot call an instance method inside a static context
		
	}
	
	public static void main(){
		System.out.println("an overloaded main method");
	}
	
	public void doStuff(){
		//System.out.println(j);
		System.out.println(staticInt);//can access static variables inside a instance context
		System.out.println(this.instanceInt);// we can also access instance variables inside an instance method
	}

}
