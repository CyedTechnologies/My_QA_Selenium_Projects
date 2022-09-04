package javaBasics;

public class VoidMethod {

	public static void main(String[] args) {
		
		// Void don't return any value but needs to create an object of the class
		VoidMethod M1 = new VoidMethod();
		M1.myMethod1();
		
	}
	void myMethod1() {
		System.out.println("Void needs to create an object of the class");
	}
	
}
