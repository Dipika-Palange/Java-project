package abstraction;

public class InterfaceImplEx implements Printable,Showable {

	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show() from showable interface ");
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("show() from showable interface ");
		float r=10f;
		System.out.println("Area of Circle "+(PI*r*r));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplEx ie=new InterfaceImplEx();
		ie.show();
		ie.calculate();
		ie.square(5);
		System.out.println("cube: "+Printable.cube(4));
	}

}
