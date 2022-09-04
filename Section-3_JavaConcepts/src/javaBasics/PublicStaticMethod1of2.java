package javaBasics;

public class PublicStaticMethod1of2 {
	// Public static method, you can call this method from another class but you don't need to
	// create an object, and static returns values. 
	
	public static String myMethod1() {
		return "This is a public static method which can call from the same class or another class"
				+ " without creating an object of the class";
	}
}
