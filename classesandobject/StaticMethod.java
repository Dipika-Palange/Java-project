package classesandobject;

public class StaticMethod {
	
	public  static void add(int a,int b)
	{
		System.out.println("Add " +(a+b));
	}
	public  static void add(int a,int b,int c)
	{
		System.out.println("Add " +(a+b+c));
	}
	static
	{
		System.out.println("it will call before main()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add(12,4);
		StaticMethod.add(10, 40);
		StaticMethod.add(20, 20, 30);
	}

}
