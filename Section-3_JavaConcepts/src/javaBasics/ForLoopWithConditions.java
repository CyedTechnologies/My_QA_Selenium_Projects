package javaBasics;

public class ForLoopWithConditions {

	public static void main(String[] args) {
		
		int [] empID = new int[3];
		empID[0]=100;
		empID[1]=200;
		empID[2]=300;
		
		for (int i = 0; i < empID.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
