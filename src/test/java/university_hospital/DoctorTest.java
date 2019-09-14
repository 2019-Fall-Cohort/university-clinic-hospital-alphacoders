package university_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DoctorTest {
	
	@Test
	public void doctorShouldBeAnEmployee()  {
		Employee underTest = new Doctor ("Test Doctor");
		String result = underTest.getName();
		assertThat(result, is("Test Doctor"));
		
	}

}
