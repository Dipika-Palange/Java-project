package classesandobject;

public class OverloadingEx {

		public void add(int a,int b,int c) {
			System.out.println("Add:"+(a+b+c));
			
		}
		public void add(float p, float q) {
			System.out.println("Add:"+(p+q));
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx oe=new OverloadingEx();
		oe.add(2.4f, 3.5f);
		oe.add(12, 20, 30);
	}

}
