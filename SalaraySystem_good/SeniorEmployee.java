public class SeniorEmployee extends Employee
{
	private String name;
	private double salary;
	private int raisePercent;
	private double raiseAmount;
	
	/**
	 * Constructor
	 * @param String name
	 * @param double salary
	 */
	public SeniorEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.setRaisePercent(7);
		this.setRaiseAmount(0);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	protected void setRaisePercent(int raisePercent) {
		this.raisePercent = raisePercent;
	}

	protected void setRaiseAmount(int raiseAmount) {
		this.raiseAmount = raiseAmount;
	}

	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}

	public int getRaisePercent() {
		return this.raisePercent;
	}

	public double getRaiseAmount() {
		return this.raiseAmount;
	}

	/**
	 * return a String representation of a SeniorEmployee
	 * @return String
	 */
	public String toString() {
		return "Senior employee " + this.name + " has salary " + this.salary;
	}
}