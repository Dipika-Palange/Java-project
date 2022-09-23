package classesandobject;

import java.util.Scanner;

public class Test {
	


	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		/*	Scanner sc = new Scanner(System.in);
			int dd,mm,yy;
			dd = sc.nextInt();
			mm=sc.nextInt();
			yy = sc.nextInt();

			Person p = new Person();
			p.display();
			
			Person p2 = new Person(102, "Riya", new MyDate(dd,mm,yy));
			p2.display();*/
			
			EmployeeIn e1 = new EmployeeIn();
			e1.calculate();
			e1.display();
			
			System.out.println();
			
			EmployeeIn e2 = new EmployeeIn(102, "Manas", new MyDate(12, 5, 1995) , 20, 1800);
			e2.calculate();
			e2.display();
		}

	


}
