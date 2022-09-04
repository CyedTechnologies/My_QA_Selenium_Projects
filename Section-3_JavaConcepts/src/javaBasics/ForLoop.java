package javaBasics;

public class ForLoop {

	public static void main(String[] args) {
		// To execute for loop we need an array first
		
		String [] myString = {"June", "July", "August", "September"};
		for(String newString:myString) {
			System.out.println(newString);
			System.out.println("---------------------");
		}
		
		int [] myNumber = new int [3];
		myNumber[0]= 2020;
		myNumber[1]= 2021;
		myNumber[2]= 2022;
		for (int i = 0; i < myNumber.length; i++) {
			System.out.println(myNumber[i]);			
		}
	}

}
