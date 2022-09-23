package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	Employee emp=new Employee();
	@Test
	public void testCalSalary() {
		emp.setId(101);
		emp.setAge(22);
		emp.setName("Ravi");
		emp.setMonthlySalary(12000);
		double salary=emp.calYearlySalary(emp);
		assertEquals(144000, salary,0.0);
	}
	
	@Test
	public void testCalculateAppraisal() {
		
		emp.setId(102);
		emp.setAge(26);
		emp.setName("Raj");
		emp.setMonthlySalary(26000);
		
		double appraisal=emp.calAppraisal(emp);
		assertEquals(500, appraisal,0.0);
	}

	
	

}
