package salary;

public class JuniorEmployee extends Employee{

	public JuniorEmployee(String name) {
		super(name);
	}
	
	public JuniorEmployee(String name, double startSalary) {
		super(name, startSalary);
	}
	
	public void raiseSalary(){
		this.salary = this.salary * 1.05;
	}
	
	public String makeEmployeeStringRepresentation() {
		return "Junior employee " + this.name + " has a salary of " + this.salary + " per month.";
	}

	
}
