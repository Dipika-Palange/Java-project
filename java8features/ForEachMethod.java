package java8features;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("Thane");
		list.add("Pune");
		list.add("Chennai");
		list.add("Bangalore");
		list.add("Mumbai");
		
		list.forEach(str -> System.out.println(str));
	}

}
