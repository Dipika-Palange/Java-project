package java8features;

import java.util.ArrayList;

public class WithoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("Dip");
		list.add("Raju");
		list.add("Ravi");
		list.add("Shubham");
		list.add("Sanika");
		list.add("Shiv");
		
		
		int count=0;
		for (String string : list) {
			
			if(string.length()<5)
				count++;
				
		}
		System.out.println("there are " +count + " String with length less than 5");
	}

}
