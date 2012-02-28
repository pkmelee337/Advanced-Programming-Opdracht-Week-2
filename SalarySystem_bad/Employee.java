public class Employee {
	private int k = 0; // kind of employee, 0 means junior, 1 is medior, 2 is senior
	private String name;
	private double sal;
	
	public Employee() {
		this.k = 0;
		name = "";
		sal = 0;
	}
	
	public Employee(String n, int k) {
		name = n; this.k = k;
	}
	
	public void setKind(int k) {
		this.k = k;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return k;
	}
	
	public void setSalary(double s) {
		sal = s;
	}
	
	public double getPay() {
		return sal;
	}
	
	public String toString() {
		String r="";
		if (k == 0) r+="Normal ";
		if (k == 1) r+="Junior ";
		if (k == 2) r+="Medior ";
		r += "employee " + name + " has salary " + sal;
		return r;
	}

}
