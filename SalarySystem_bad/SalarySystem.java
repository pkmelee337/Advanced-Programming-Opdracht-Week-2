import java.util.ArrayList;


public class SalarySystem {
	
	private ArrayList empArray = new ArrayList();
	
	public void addColleague(Employee c) {
		empArray.add(c);
	}
	
	public Employee search(String s) {
		for (int i = 0; i < empArray.size(); i++)
			if (((Employee)empArray.get(i)).getName().equals(s)) return (Employee)empArray.get(i);
		return new Employee("no employee has been found",-1);
	}
	
	public void raiseSalary(Employee e) {
		// if emp is jr, then he gets 5% raise + 100
		// when emp is mr, he gets 6% + 100
		// when emp is sr, he gets 7% 
		switch (e.getLevel()) {
		case 0: 
			e.setSalary(e.getPay() * 105 + 10000);
			e.setSalary(e.getPay() / 100);
			System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
			break;
		case 1:
			e.setSalary(e.getPay() * 106+ 20000);
			e.setSalary(e.getPay() / 100);
			System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
			break;
		case 2:
			e.setSalary(e.getPay() * 107);
			e.setSalary(e.getPay() / 100);
			System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
			break;	
		}
	}
	
	public SalarySystem() {
		Employee j = new Employee("Jaap",0);
		Employee m = new Employee("Fred",1);
		Employee s = new Employee("Hans",2);
		j.setSalary(1700.0);
		m.setSalary(2000);
		s.setSalary(2300);
		addColleague(j);
		addColleague(m);
		addColleague(s);
	}
	
	public void printAll() {
		for (Object e : empArray) {
			Employee e1 = (Employee)e;
			System.out.print(e.toString() + "\n");
		}
	}
	
	public static void main(String args[]) {
		// raise salary of all employees
		SalarySystem s = new SalarySystem();
		s.printAll();
		Employee e = s.search("Jaap");
		s.raiseSalary(e);
		e = s.search("Fred");
		s.raiseSalary(e);
		e = s.search("Hans");
		s.raiseSalary(e);
		s.printAll();		
	}
	
}


