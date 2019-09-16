package university_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ReceptionistTest {
	
	@Test
	public void receptionistShouldBeAnEmployee()  {
		Employee underTest = new Receptionist ("Test Receptionist");
		String result = underTest.getName();
		assertThat(result, is("Test Receptionist"));

}
}