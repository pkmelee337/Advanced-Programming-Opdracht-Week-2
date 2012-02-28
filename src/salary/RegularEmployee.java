package salary;

public class RegularEmployee extends Employee{

	public RegularEmployee(String name) {
		super(name);
	}
	
	public RegularEmployee(String name, double startSalary) {
		super(name, startSalary);
	}
	
	public void raiseSalary(){
		this.salary = this.salary * 1.06;
	}
	
	public String makeEmployeeStringRepresentation() {
		return "Regular employee " + this.name + " has a salary of " + this.salary + " per month.";
	}

	
}
