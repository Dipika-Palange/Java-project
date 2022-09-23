package basic;

import java.util.Scanner;


public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount, ProductCode;
		int discount = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the amount");
		amount=sc.nextInt();
		System.out.println("enter the product code");
		ProductCode=sc.nextInt();
		if(ProductCode==1)
	      {
	            	
	            	if(amount>=500)
	            	
	            		discount=amount*12/100;
	         
	            	else if(amount>=300 )
	            	
	            		discount=amount*8/100;
	            	
	            	else
	            	{
	            		discount=amount*2/100;
	            	}
	     System.out.println("Discount Amount= " +discount);
	      }
	         
	      else if(ProductCode==2)
	      {
	            	
	            	if(amount>=2000)
            	
            		discount=amount*10/100;
            	
            	else if(amount>=1500 )
            	
            		discount=amount*5/100;
            	
	       System.out.println("Discount Amount= " +discount);
	      }
	      else if(ProductCode==3) 
	      {
	    	  
	            	if(amount>=5000)
	            	
	            		discount=amount*10/100;
	            	
	            	else if(amount>=2500 )
	            	{
	            		discount=amount*5/100;
	            	}
	            	
	     System.out.println("Discount Amount= " +discount);
	           
	      }
	      
	      
	    }

	
		


	}


