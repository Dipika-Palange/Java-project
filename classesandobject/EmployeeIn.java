package classesandobject;

public class EmployeeIn extends Person {

	

		float workingDays, perDay,salary;
		
		public EmployeeIn()
		{
			super();	//used to call super class constructor
			workingDays=18;
			perDay=1400;
		}

		public EmployeeIn(int id, String name, MyDate dob, float workingDays, float perDay)
		{
			super(id,name,dob);
			this.workingDays = workingDays;
			this.perDay = perDay;
		}
		
		public void calculate()
		{
			salary = workingDays * perDay;
		}
		
		@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println("Salary : "+salary);
		}
		
	}


