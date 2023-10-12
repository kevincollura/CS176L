package cs176;
import java.util.Scanner;
public class Week6prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 Scanner scanner = new Scanner(System.in);

		 System.out.print("What is your name? ");
		 String name = scanner.nextLine();

		System.out.print("Hello " + name + ", how many exams have you taken? ");
		int numExams = scanner.nextInt();

		 if (numExams <= 0) {
		 System.out.println("Invalid number of exams. Please enter a positive number.");
		 return;
		        }

		 double totalScore = 0;

		for (int i = 1; i <= numExams; i++) {
		 System.out.print("Give me the score of exam " + i + ": ");
		 int score = scanner.nextInt();

		while (score < 0 || score > 100) {
		 System.out.print("Invalid score! Please give me the score of exam " + i + ": ");
		  score = scanner.nextInt();
		  }

		   totalScore += score;
		    }

		  double average = totalScore / numExams;

		 System.out.println("Hi, " + name + ", your average score of " + numExams + " exams is " + average);
		    }
		}
	
		
		
		
		
		
		


