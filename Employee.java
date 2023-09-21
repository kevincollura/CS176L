package cs176;

public class Employee {
	private String name;
	private double salary;
	public Employee (String employeeName, double employeeSalary) {
		name = employeeName;
		salary = employeeSalary;

	}
	
	public String getName() {
		return name;
	
	}
	
	public double getSalary(){
		return salary;
		
	}
	
	public double raiseSalary (double byPercent){
		return salary += (0.01 * byPercent);
	}
	
	
	
}
