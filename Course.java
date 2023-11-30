package week10remaster;


	import java.util.ArrayList;


	class Student {
	    String name;
	    String id;
	    ArrayList<Grade> grades;

	  
	    public Student(String name, String id) {
	        this.name = name;
	        this.id = id;
	        this.grades = new ArrayList<>();
	    }
	   
	    public String getName() {
	    	return name;
	    }
	    
	   
	    public String getId() {
	        return id;
	    }

	
	    public void addGrade(int testNumber, int score) {
	        grades.add(new Grade(testNumber, score));
	    }

	   
	    public int getGrade(int testNumber) {
	        for (Grade grade : grades) {
	            if (grade.testNumber == testNumber) {
	                return grade.score;
	            }
	        }
	        return -1; 
	    }
	}

	class Grade {
	    int testNumber;
	    int score;

	   
	    public Grade(int testNumber, int score) {
	        this.testNumber = testNumber;
	        this.score = score;
	    }
	}

	class Course {
	    String courseName;
	    String major;
	    String level;
	    ArrayList<Student> students;

	   
	    public Course(String courseName, String major, String level) {
	        this.courseName = courseName;
	        this.major = major;
	        this.level = level;
	        this.students = new ArrayList<>();
	    }

	   
	    public void addStudent(String name, String id) {
	        students.add(new Student(name, id));
	    }

	
	    public void addGrade(String studentId, int testNumber, int score) {
	        for (Student student : students) {
	            if (student.getId().equals(studentId)) {
	                student.addGrade(testNumber, score);
	                return;
	            }
	        }
	        System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
	        System.out.println("");
	    }

	    
	    public void printGrade(int testNumber) {
	        for (Student student : students) {
	            int score = student.getGrade(testNumber);
	            if (score != -1) {
	                System.out.println(student.name + " " + score);
	            }
	        }
	       
	    }

	
	    public void sortGrade(int testNumber) {
	        boolean testSort;
	        do {
	        	testSort = false;
	            for (int i = 0; i < students.size() - 1; i++) {
	                int score1 = students.get(i).getGrade(testNumber);
	                int score2 = students.get(i + 1).getGrade(testNumber);
	                if (score1 < score2) {
	                    
	                    Student temp = students.get(i);
	                    students.set(i, students.get(i + 1));
	                    students.set(i + 1, temp);
	                    testSort = true;
	                }
	            }
	        } while (testSort);
	    }

	   
	    public void updateGrade(String studentId, int newScore) {
	        for (Student student : students) {
	            if (student.getId().equals(studentId)) {
	                student.grades.set(0, new Grade(1, newScore)); 
	            }
	        }
	        System.out.println("Error, no student with id '" + studentId + "' registered.");
	    }

	}

