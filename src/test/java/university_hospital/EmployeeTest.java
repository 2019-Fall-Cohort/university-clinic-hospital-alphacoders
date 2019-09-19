package university_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void employeeShouldHaveAName() {
		Employee underTest = new Employee("Test Person");
		String result = underTest.getName();
		assertThat(result, is("Test Person"));
		
	}
	@Test
	public void employeeShouldHaveSalary() {
		Employee underTest = new Employee("Test Person");
		int result = underTest.getSalary();
	}
	@Test
	public void employeeShouldHaveIdentificationNumber() {
		Employee underTest = new Employee("Test Person");
		int result = underTest.getIdentificationNumber();
	}
		
	
	@Test
	public void shouldHaveEmployeeList() {
		Employee underTest = new Employee("Test Person");
		
	}
	
		
		
	}


