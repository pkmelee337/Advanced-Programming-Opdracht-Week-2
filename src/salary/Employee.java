package salary;

public abstract class Employee {
	
	protected String name; 
	protected double salary;
	
	public Employee(String name){
		this.name = name;
		this.salary = 0;
	}
	
	public Employee(String name,double startSalary){
		this.name = name;
		this.salary = startSalary;
	}
	
	public boolean equals(Employee comparableEmployee){
		boolean comparableEmployeeIsEqual = false;
		comparableEmployeeIsEqual = comparableEmployeeIsEqual && (this.name == comparableEmployee.name);
		comparableEmployeeIsEqual = comparableEmployeeIsEqual && (this.salary == comparableEmployee.salary);
		return comparableEmployeeIsEqual;
	}
	
	public abstract void raiseSalary();
	public abstract String makeEmployeeStringRepresentation();

}
