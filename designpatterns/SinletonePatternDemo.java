package designpatterns;

class SingleObject
{
	// create an object
	private static SingleObject instance=new SingleObject();
	
	//make private constructor
	private SingleObject() {}
	
	//get only object avialbility
	public static SingleObject getInstance()
	{
		return instance;
	}
	public void show()
	{
		System.out.println("Hello World");
	}
}

public class SinletonePatternDemo {
	
	public static void main(String[] args) {
	   //compile time error 
		//SingleObject  obj=new SingleObject();
		
		SingleObject obj=SingleObject.getInstance();
		obj.show();
	}

}
