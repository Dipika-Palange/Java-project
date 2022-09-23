package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxBFR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int a;
		double tax;
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the salary amount");
		a=Integer.parseInt(br.readLine());
		
		 tax=a*12/100;
		 System.out.println("Tax amount="+tax);
	}

}
