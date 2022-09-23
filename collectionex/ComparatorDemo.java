package collectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(101,"Ajay",22));
		list.add(new Student(102,"Riya",20));
		list.add(new Student(103,"Jay",23));
		list.add(new Student(104,"veena",21));
		
		System.out.println("sorting on basis id");
		Collections.sort(list, new AgeComparator());
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("\n sorting on basis name");
		Collections.sort(list, new NameComparator());
		for (Student student : list) {
			System.out.println(student);
		}
		
		

	
}
}