package javaBasics;

import java.util.ArrayList;

public class ForLoopWithDynamicArray {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ontario");
		list.add("Manituba");
		list.add("Saskachivan");
		list.add("British Columbia");
		for (String newList:list) {
			System.out.println(newList);
		}
	}

}
