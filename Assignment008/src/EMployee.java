
public class EMployee {
      
	private String employeeName;
	private double currentSalary;
	
	
	public EMployee(String employeeName, double currentSalary) 
	{
		this.employeeName = employeeName;
		 this.currentSalary = currentSalary;
	}
	public String getName() 
	{
		return employeeName;
	}
	public double getSalary() 
	{
		return currentSalary;	
	}
	public void raiseSalary(double byPercent) 
	{
		this.currentSalary+= currentSalary*byPercent/100;
	}
}
