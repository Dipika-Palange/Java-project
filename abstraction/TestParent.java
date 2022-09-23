package abstraction;

abstract  class Parent
{
	public abstract void message();
	
}

class SubClass1 extends Parent
{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is First Subclass");
	}
}
	
class SubClass2 extends Parent
{
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}
}


public class TestParent
{
	public static void  main(String[] args)
	{
	Parent s1=new SubClass1();
		
 Parent s2=new SubClass2();
		
		s1.message();
		s2.message();
	}
}
