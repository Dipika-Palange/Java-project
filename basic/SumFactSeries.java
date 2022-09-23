package basic;

import java.util.Scanner;

public class SumFactSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num;
		  double res = 0, fact = 1;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  num=sc.nextInt();
		 
	        for (int i = 1; i <= num; i++)
	        {
	        	System.out.println(i+"/"+(i)+"!");
	            fact = fact * i;
	 
	            res = res + (i / fact);
	        }
	        
	        System.out.println("="+res);
	    }
	}


