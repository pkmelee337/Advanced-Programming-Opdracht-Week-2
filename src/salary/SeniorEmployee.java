package salary;

public class SeniorEmployee extends Employee{

	public SeniorEmployee(String name) {
		super(name);
	}
	
	public SeniorEmployee(String name, double startSalary) {
		super(name, startSalary);
	}
	
	public void raiseSalary(){
		this.salary = this.salary * 1.007;
	}
	
	public String makeEmployeeStringRepresentation() {
		return "Senior employee " + this.name + " has a salary of " + this.salary + " per month.";
	}

	
}
