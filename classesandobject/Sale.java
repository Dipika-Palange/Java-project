package classesandobject;

public class Sale extends EmployeeIn{

	float sale, commision,TotalSalary;
	
	public Sale() {
		// TODO Auto-generated constructor stub
		super();
		sale=95;
	}
	public Sale(int id, String name, MyDate dob, float workingDays, float perDay,float sale)
	{
		super(id, name, dob, workingDays, perDay);
		
		this.sale=sale;
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(sale>=95)
		{
		 commision =(float) (0.20*salary);
		}
		else if(sale>=90)
		{
		commision =(float) (0.15*salary);
		}

		else if(sale>=80)
		{
		 commision =(float) (0.10*salary);
		}
		else if(sale>=75)
		{
		 commision =(float) (0.5*salary);
		}
		else
		{
			commision=0;	
		}
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		float TotalSalary=commision+salary;
		
		System.out.println("Commision="+commision);
		System.out.println("Toatal salary="+TotalSalary);
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sale s=new Sale();
		s.calculate();
		s.display();
		
		System.out.println();
		
		Sale sl=new Sale(2, "Reva", new MyDate(12, 5, 1995), 25, 1500, 90);
		sl.calculate();
		sl.display();
	}

}
 