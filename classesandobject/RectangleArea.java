package classesandobject;

public class RectangleArea {

	int l,b;
	public RectangleArea()
	{
		l=12;
		b=5;
	}
	public RectangleArea(int length,int breadth)
	{
		l=length;
		b=breadth;
	}
	public void area()
	{
		System.out.println("Area of rectangle:"+(l*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea ra=new RectangleArea();
		ra.area();
	
		RectangleArea ra1=new RectangleArea(10,4);
		ra1.area();
	}

}
