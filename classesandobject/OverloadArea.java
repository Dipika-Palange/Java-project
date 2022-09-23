package classesandobject;

public class OverloadArea {

		public void area(int r) {
			System.out.println("Area of Circle:"+(3.14*r*r));
		}
		public void area(int l,int b) {
			System.out.println("Area of rectangle:"+(l*b));	
		}
		public void area(double h,double ba) {
			System.out.println("Area of Circle:"+(0.5*h*ba));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadArea oa=new OverloadArea();
		oa.area(5);
		oa.area(10, 20);
		oa.area(4, 10);
	}

}
