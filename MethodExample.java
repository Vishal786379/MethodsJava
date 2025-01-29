package com.vishal.metods;

public class MethodExample {
	
	//formal parameters
	static int addNumber(int a, int b) {
		System.out.println("Sum is : "+(a+b));
		return (a+b);
	}
	
	static void addSomething() {
		System.out.println("I will add something for you");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//function has name
		// accept values(Parameters)
		//return values
		//a method is a block of code which only runs when it called
		//code reusability: write code once call many times
		
		System.out.println("Testing");
		
//		MethodExample me = new MethodExample();
		Helper.printSomething();
		addSomething();
		
		//actual parameters
		int result = addNumber(45, 1112);
		System.out.println("Result is : "+result);
	}

}
