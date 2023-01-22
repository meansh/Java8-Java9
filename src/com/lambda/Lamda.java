package com.lambda;

@FunctionalInterface
//Functional interface can only have Single Abstract Method, but this toString is 
//an object method, and every class in Java extends Object class. That is why,
//statement at line 10 is correct

interface A{
	void show();
	String toString(); //This toStirng is a method
}

/*
 * class B extends Object implements A{ public void show() {
 * System.out.println("hi"); } }
 */

public class Lamda {
	public static void main(String[] args) {
		//A obj = new A() {
			//Anonymous inner class, Java 7 Concept
			//public void show() {
				//System.out.println("Hi in show");
			//}
		//};
		
		/* Java 8 concept is below, lambda expression */
		A obj = () ->System.out.println("Hi in show");
		obj.show();
	}
}
