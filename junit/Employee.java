package junit;

public class Employee {

	private int id,age;
	private String name;
	private double monthlySalary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public double calYearlySalary(Employee emp)
	{
		double yearlySalary=getMonthlySalary()*12;
		return yearlySalary;
	}
	
	public double calAppraisal(Employee emp)
	{
		double appraisal =0;
		if(getMonthlySalary()>30000)
		{
			appraisal=1000;
		}
		else
		{
			appraisal=500;
		}
		return appraisal ;
	}
}
