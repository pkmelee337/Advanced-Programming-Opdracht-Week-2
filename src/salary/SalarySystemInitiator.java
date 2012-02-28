package salary;

import java.util.ArrayList;
import java.util.List;

public class SalarySystemInitiator {
	/**
	 * Initiation of the test-run of the salary-management-program
	 * @param args: Do nothing with this parameter
	 */
	public static void main(String args[]) {
		
		//1. Initiate Test Objects
		Employee junior = new JuniorEmployee("Junior Worker", 5.5);
		Employee regular = new RegularEmployee("Regular Worker", 7.5);
		Employee senior = new SeniorEmployee("Senior Worker", 10);
		List<Employee> managableEmployees = new ArrayList<Employee>();
		managableEmployees.add(junior);
		managableEmployees.add(regular);
		managableEmployees.add(senior);
		
		//2. Initiate Salary System
		SalaryManager salaryManager = new SalaryManager(managableEmployees);
		
		//3. Test raiseSalary Function
		System.out.println(salaryManager.makeEmployeeOverview());
		junior.raiseSalary();
		System.out.println(salaryManager.makeEmployeeOverview());
		
		//4. Test Search Function
		List<Employee> foundEmployees = salaryManager.searchEmployee("ThisOneDoesNotExist");
		if(foundEmployees.isEmpty()){
			System.out.println("No search results found for name 'ThisOneDoesNotExist'\n");
		}
		else{
			System.out.println("Results for employee search with name 'ThisOneDoesNotExist':");
			System.out.println(salaryManager.makeOverviewForEmployeeList(foundEmployees));
		}
		foundEmployees = salaryManager.searchEmployee("Senior Worker");
		if(foundEmployees.isEmpty()){
			System.out.println("No results found for name 'Senior Worker'\n");
		}
		else{
			System.out.println("Results for employee search with name 'Senior Worker':");
			System.out.println(salaryManager.makeOverviewForEmployeeList(foundEmployees));
		}
		
		//5. RaiseSalary and search again
		senior.raiseSalary();
		foundEmployees = salaryManager.searchEmployee("Senior Worker");
		if(foundEmployees.isEmpty()){
			System.out.println("No results found for name 'Senior Worker'\n");
		}
		else{
			System.out.println("Results for employee search with name 'Senior Worker':");
			System.out.println(salaryManager.makeOverviewForEmployeeList(foundEmployees));
		}
		
	}
}
