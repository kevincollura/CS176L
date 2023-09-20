package cs176;

public class Week2problem3 {

	public class University{
		public String universityName;
		public University (String name, int students) {
			universityName = name;
			
		}
		
		public String getName() {
			return universityName;
		
			
		}
		
		public String totalOfStudents() {
			return universityName;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		University Monmouth = new University ("Monmouth University", 0);
		
		System.out.println(Monmouth.getName());
		System.out.println("Total of Students: "+Monmouth.totalOfStudents());
		
		
		
		
		
		
		
	}

}
