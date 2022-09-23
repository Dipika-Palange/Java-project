package basic;

import java.util.Scanner;

public class SalaryTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary,tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		salary=sc.nextInt();
		System.out.println("salary ="+salary);
		if(salary<=25000)
		{
			tax=10*salary/100;
			
		}
		else
		{
			tax=15*salary/100;
			
		}
		System.out.println("tax amount="+tax);

	}

}
