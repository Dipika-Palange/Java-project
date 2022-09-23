package abstraction;

public abstract class Bike {
	
	public Bike() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor In Abstract Class");
	}
	
	public abstract void run();
	
	public void display()
	{
		System.out.println("Inside Non Abstract Class");
	}
	

}
