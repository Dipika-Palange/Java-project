package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaBFR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int r,l,b,h,ba;
		 double   pi=3.14,AC;
			System.out.println("enter value of r");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			r=Integer.parseInt(br.readLine());
			
		
			AC= 3.14 *r*r ;
			
			System.out.println("Area of Circle=" +AC);
			
			System.out.println("enter value of  l and b");
			l=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			
			int AR= l*b ;
			
			System.out.println("area of rectangle="+ AR);
			
			System.out.println("enter value of  h and ba");
			h=Integer.parseInt(br.readLine());
			ba=Integer.parseInt(br.readLine());
			
	double  AT= 0.5*h*ba;
			
			System.out.println("area of rectangle=" +AT);

	}

}
