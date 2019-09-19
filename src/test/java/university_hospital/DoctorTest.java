package university_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DoctorTest {
	
	@Test
	public void doctorShouldBeAnEmployee() {
		Employee underTest = new Doctor("Test Doctor");
		String result = underTest.getName();
		assertThat(result, is("Test Doctor"));
	}
	@Test
	public void doctorShouldShowSalary() {
		Doctor underTest = new Doctor ("Test Doctor");
		int result = underTest.getDoctorSalary();
		assertThat(result, is(90000));
	}
	@Test
	public void doctorShouldHaveIdentificationNumber() {
		Doctor underTest = new Doctor ("Test Doctor");
		int result = underTest.getDoctorIdentificationNumber(); 
			assertThat(result, is(999));
		}

		
	}
	

	

		
	

