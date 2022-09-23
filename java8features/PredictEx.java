package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredictEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list= Student.getStudents();
		
		Predicate<Student> p1= s->s.getName().startsWith("R");
		Predicate<Student> p2=s->s.getAge()>40 && s.getName().startsWith("A") ;
		Predicate<Student>p3=s->s.getAge()<40;
		
		boolean b1=list.stream().anyMatch(p1);
		System.out.println("p1 with anyMatch : " +b1);
		
		boolean b2=list.stream().anyMatch(p2);
		System.out.println("p2 with anyMatch : " +b2);
		
		boolean b3=list.stream().noneMatch(p2);
		System.out.println("p2 with anyMatch : " +b3);
		
		boolean b4=list.stream().allMatch(p1);
		System.out.println("p1 with anyMatch : " +b4);
		
		boolean b5=list.stream().noneMatch(p1);
		System.out.println("p2 with anyMatch : " +b5);
	}

}
