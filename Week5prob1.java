package cs176;

import java.util.Scanner;
// problem one 

public class Week5prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first name: ");
		String nameOne = in.nextLine();
		
		System.out.println("First name is : "+ nameOne);
		
		System.out.print("Enter the second name: ");
		String nameTwo = in.nextLine();
		
		System.out.println("Second name is: " + nameTwo);
		
		
	
		if(nameOne.equals(nameTwo)) {
			System.out.println("same name "  + nameOne+ " " + nameTwo);
			
		} else {
			System.out.println("name1 and name2 are different");
		}
		
		
	}

}
