package Week8;

import java.util.Scanner;

public class removeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the string: ");
	
	String words = scanner.nextLine();
		
	System.out.println("Remove Character: ");
	String value2 = scanner.nextLine();
	
		
	StringBuilder result = new StringBuilder();
	for (int i = 0; i <= words.length() - 1; i++) {
		char character = value2.charAt(0);
		
   if ( words.charAt(i) != character) {
        result.append(words.charAt(i));
      }
   
        }
	System.out.println(result);
	
	scanner.close();
	}

}
