package collectionex;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("Raj");
		list.add("Siddhi");
		list.add("Reema");
		list.add("Ravi");
		list.add("Ravina");
		
		Collections.sort (list);
		 
		System.out.println("sorting string object");
		for (String string : list) {
			System.out.println(string);
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(50);
		list2.add(12);
		list2.add(30);
		list2.add(2);
		
		Collections.sort(list2);
		
		System.out.println("\n Sorting wrapper object");
		for (Integer integer : list2) {
			System.out.println(integer);
		}

	}

}
