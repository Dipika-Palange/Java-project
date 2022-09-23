package collectionex;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Ajay",22));
		list.add(new Employee(102,"Jay",20));
		list.add(new Employee(103,"Riya",23));
		list.add(new Employee(104,"veena",21));
		System.out.println("Ascending order");
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("\n Decending order");
		Collections.reverse(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
