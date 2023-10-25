package Week7;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two positive numbers: ");
        
        
        int num1 = getUserInput(scanner);
        
        
        int num2 = getUserInput(scanner);
        
       
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD is: " + gcd);
    }

    
    public static int getUserInput(Scanner scanner) {
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            if (number < 0 || number > 1000) {
                System.out.println("This Number is out of range. Try again.");
            }
        } while (number < 0 || number > 1000);
        return number;
    }

    
    public static int findGCD(int numA, int numB) {
        if (numB == 0) {
            return numA;
        }
        return findGCD(numB, numA % numB);		
		
		
		
		
		
		
		
		
		
		
		
	}

}
