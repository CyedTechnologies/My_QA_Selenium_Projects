package javaBasics;

import java.util.ArrayList;

public class ArrayListOrDynamicArray {

	public static void main(String[] args) {
		// Remember that ArrayList is only for String
		// This is also called Dynamic Array.
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Jauhar");
		myArrayList.add("Tariq");
		myArrayList.add("Watan");
		myArrayList.add("Irfan");
		System.out.println(myArrayList.get(0));
		System.out.println(myArrayList.get(1));
		System.out.println(myArrayList.get(2));
		System.out.println(myArrayList.get(3));

	}

}
