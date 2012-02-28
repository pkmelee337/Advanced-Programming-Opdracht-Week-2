import java.util.ArrayList;

public class SalarySystem {
	
	private Logger logger;
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	/**
	 * Constructor
	 */
	public SalarySystem() {
		logger = new Logger();
		Employee firstEmployee = new JuniorEmployee("Jaap", 1700);
		Employee secondEmployee = new RegularEmployee("Fred", 2000);
		Employee thirdEmployee = new SeniorEmployee("Hans", 2300);
		this.addEmployee(firstEmployee);
		this.addEmployee(secondEmployee);
		this.addEmployee(thirdEmployee);
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	public Employee searchEmployee(String searchName) throws EmployeeNotFoundException {
		for(Employee employee : this.employees) {
			if(employee.getName() == searchName) {
				return employee;
			}
		}
		throw new EmployeeNotFoundException("no employee has been found");
	}
	
	public void raiseSalary(Employee employee) {
		double newSalary = (employee.getSalary() * (100 + employee.getRaisePercent()) / 100) + employee.getRaiseAmount();
		employee.setSalary(newSalary);
		this.logger.log("employee " + employee.getName() + " has new salary: " + employee.getSalary());
	}
	
	public void printAll() {
		for (Employee employee : this.employees) {
			System.out.print(employee.toString() + "\n");
		}
	}
	
	public static void main(String args[]) {
		SalarySystem system = new SalarySystem();
		system.printAll();
		Employee employee1;
		try {
			employee1 = system.searchEmployee("Jaap");
			system.raiseSalary(employee1);
			Employee employee2 = system.searchEmployee("Fred");
			system.raiseSalary(employee2);
			Employee employee3 = system.searchEmployee("Hans");
			system.raiseSalary(employee3);
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		system.printAll();		
	}
	
}


