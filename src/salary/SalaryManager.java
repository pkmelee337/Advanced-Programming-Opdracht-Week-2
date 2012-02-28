package salary;

import java.util.ArrayList;
import java.util.List;

public class SalaryManager {
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	public SalaryManager(List<Employee> employeeList){
		this.employees = employeeList;
	}
	
	public List<Employee> searchEmployee(String name){
		List<Employee> foundEmployees = new ArrayList<Employee>();
		for(Employee employee : this.employees){
			if(employee.name == name){
				foundEmployees.add(employee);
			}
		}
		return foundEmployees;
	}
	
	public String makeEmployeeOverview(){
		return this.makeOverviewForEmployeeList(this.employees);
	}
	
	public String makeOverviewForEmployeeList(List<Employee> employeeList){
		String employeeOverview = "";
		for(Employee employee : employeeList){
			employeeOverview += employee.makeEmployeeStringRepresentation() + "\n";
		}
		return employeeOverview;
	}
	
}


