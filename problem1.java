package Week7;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		
		String inputWord = scanner.nextLine().toLowerCase()	;
		if (isPalindrome(inputWord)) {
			System.out.println("This is a Palindrome.");
		}
		else {
			System.out.println("This is NOT a Palindrome.");
		}
		
		scanner.close();
		
		public static boolean isPalindrome(String str) {
			return str.equals(new StringBuilder(str).reverse().toString());
		}
		
	}
	
}
