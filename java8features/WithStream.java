package java8features;

import java.util.ArrayList;

public class WithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> list=new ArrayList<String>();
		list.add("Dip");
		list.add("Raju");
		list.add("Ravi");
		list.add("Shubham");
		list.add("Sanika");
		list.add("Shiv");
		
		long count=list.stream().filter(str-> str.length()<5).count();
		
		System.out.println("there are " +count + " String with length less than 5");
	}

}
