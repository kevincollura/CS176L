package cs176;

public class StudentGradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		StudentGrade Kevin = new StudentGrade("Kevin");
		StudentGrade James = new StudentGrade("James", 99);
		System.out.println(Kevin.getGrade());
		System.out.println(James.getGrade());
		
		Kevin.setGrade(-100);
		System.out.println(Kevin.getGrade());
		Kevin.setGrade(1000);
		System.out.println(Kevin.getGrade());
		Kevin.setGrade(88);
		System.out.println(Kevin.getGrade());
		
		System.out.println(James.retGradeLevel());
		System.out.println(Kevin.retGradeLevel());
		Kevin.setGrade(77);
		System.out.println(Kevin.retGradeLevel());
		Kevin.setGrade(54);
		System.out.println(Kevin.retGradeLevel());
		



	}
	
}

