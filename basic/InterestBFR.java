package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterestBFR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int p,r,t,SI;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter principle amount");
		p=Integer.parseInt(br.readLine());
		
		System.out.println("enter  interest rate");
		r=Integer.parseInt(br.readLine());
		
		System.out.println("enter interest time");
		t=Integer.parseInt(br.readLine());
		
		SI= (p*r*t)/100;
		
		System.out.println("simple Interest=" +SI);
		

	}

}
