package designpatterns;

interface Shape{
	void draw();
}

class Rectangle implements Shape
{

	@Override
	public void draw() {
	System.out.println("In rectangle class : draw()");
		
	}
	
}
class Circle implements Shape
{

	@Override
	public void draw() {
	System.out.println("In circle class : draw()");
		
	}
	
}
class Square implements Shape
{

	@Override
	public void draw() {
	System.out.println("In square class : draw()");
		
	}
	
}
class ShapeFactory
{
	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
		{
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle")) 
			return  new Circle();
		
		else if(shapeType.equalsIgnoreCase("Rectangle")) 
			return  new Rectangle();
		
		else if(shapeType.equalsIgnoreCase("Square"))
		
			return new Square();
		
		return null;
	}
}

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapefactory=new ShapeFactory();
		
		Shape shape1=shapefactory.getShape("Circle");
		 shape1.draw();
		 
		Shape shape2=shapefactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3=shapefactory.getShape("Square");
		shape3.draw();
	}
}
