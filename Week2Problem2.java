package cs176;



	public class Student {
		String name;
		int scores;
		int testNumber;
		public Student(String studentName) {
			name = studentName;
			scores = 0;
			testNumber = 0;
			
		}
	public String getName() {
		return name;
		
	}
	public void addQuiz(int score) {
		scores+= score;
		testNumber+= 1;
		
	}

	public int getTotalScore() {
		return scores;
		
	}

	public int getAverageScore() {
		return scores / testNumber;
		
	}

	public int getScores() {
		return scores;
		
	}

		

	}
	
	
	public class Week2Problem2 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student KevinCollura = new Student("Kevin Collura");
		KevinCollura.addQuiz(87);
		KevinCollura.addQuiz(75);
		KevinCollura.addQuiz(76);
		KevinCollura.addQuiz(90);
		KevinCollura.addQuiz(92);
		System.out.println(KevinCollura.getScores());
		System.out.println(KevinCollura.getName());
		System.out.println(KevinCollura.getAverageScore());

		
		
		
		
		
		
		
		
		
		
		
	}

}
