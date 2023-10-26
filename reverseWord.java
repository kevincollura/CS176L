package Week8;

import java.util.Scanner;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter string: ");
	
	String result = scanner.nextLine();
	
	
	for (int i = result.length() - 1; i >= 0; i--) {
            
		System.out.print(result.charAt(i));
		
		scanner.close();
        }

	}

}
