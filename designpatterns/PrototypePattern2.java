package designpatterns;

import java.util.Scanner;

interface Prototype{
	public Prototype getClone();
}

class Employee implements Prototype{
	
	private int id;
	private String name,address;
	private double salary;


	public Employee(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}


	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return  new Employee(id, name, address, salary);
	}
	
}

public class PrototypePattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the employee id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		 String name=sc.nextLine();
				System.out.println("enter the address");
		String address=sc.nextLine();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		
		Employee employee=new Employee(id, name, address, salary);
		System.out.println(employee);
		
		Employee employee2=(Employee) employee.getClone();
		System.out.println(employee2);

	}

}
