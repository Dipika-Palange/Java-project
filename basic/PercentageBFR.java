package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PercentageBFR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int m1,m2,m3;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 3 subject marks");
		m1=Integer.parseInt(br.readLine());
		m2=Integer.parseInt(br.readLine());
		m3=Integer.parseInt(br.readLine());
		double x=m1+m2+m3 ;
			
		System.out.println("total="+x);
		double  Perc=(x*100)/300;

		System.out.println("percentage="+Perc);
	}

}
