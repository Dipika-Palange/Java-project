package classesandobject;

public class StudentStatic {
	int id;
	String name;
	static String clgName="SGI";
	
	public StudentStatic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+clgName);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentStatic ss=new StudentStatic(11,"Raj");

		StudentStatic ss1=new StudentStatic(12, "Riya");
		ss.display();
		
		ss1.display();
	}

}
