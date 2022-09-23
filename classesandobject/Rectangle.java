package classesandobject;

public class Rectangle {

	int l,b;
	public Rectangle()
	{
		l=12;
		b=5;
	}
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		System.out.println("Area of rectangle:"+(l*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.area();
	
		Rectangle r1=new Rectangle(10,4);
		r1.area();
	}

}
