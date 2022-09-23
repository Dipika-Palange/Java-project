package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmaticBFR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the numbers");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		c=a+b;
		System.out.println("Addition=" +c);
		
		c=a-b;
		System.out.println("substraction=" +c);
		
		c=a*b;
		System.out.println("Multiplication=" +c);
		
		c=a/b;
		System.out.println("division=" +c);
		
	}

}
