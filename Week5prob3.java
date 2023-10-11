package cs176;
import java.util.Scanner;

public class Week5prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

      
        if (!s.isEmpty()) {
            char firstChar = s.charAt(0);

            
            if (firstChar == '0') {
                s = "zero" + s.substring(1);
            } else if (firstChar == '1') {
                s = "one" + s.substring(1);
            } else if (firstChar == '2') {
                s = "two" + s.substring(1);
            } else if (firstChar == '3') {
                s = "three" + s.substring(1);
            } else if (firstChar == '4') {
                s = "four" + s.substring(1);
            } else if (firstChar == '5') {
                s = "five" + s.substring(1);
            } else if (firstChar == '6') {
                s = "six" + s.substring(1);
            } else if (firstChar == '7') {
                s = "seven" + s.substring(1);
            } else if (firstChar == '8') {
                s = "eight" + s.substring(1);
            } else if (firstChar == '9') {
                s = "nine" + s.substring(1);
            }
        }

        System.out.println("Result: " + s);
        scanner.close();
		
		
	}

}
