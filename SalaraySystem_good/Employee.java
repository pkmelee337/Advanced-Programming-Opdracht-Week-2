abstract class Employee 
{
	public abstract void setName(String name);
	public abstract void setSalary(double salary);
	protected abstract void setRaisePercent(int raisePercent);
	protected abstract void setRaiseAmount(int raiseAmount);
	public abstract String getName();
	public abstract double getSalary();
	public abstract int getRaisePercent();
	public abstract double getRaiseAmount();
	public abstract String toString();
}