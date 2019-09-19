package university_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class NurseTest {
	@Test
	public void nurseShouldBeAnEmployee()  {
		Employee underTest = new Nurse ("Test Nurse");
		String result = underTest.getName();
		assertThat(result, is("Test Nurse"));
}


        }
 

