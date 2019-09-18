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
	@Test
	public void receptionistShouldShowSalary() {
		Receptionist underTest = new Receptionist ("Test Receptionist");
		int result = underTest.getReceptionistSalary();
		assertThat(result, is(45000));
	}
	@Test
	public void receptionistShouldHaveIdentificationNumber() {
		Receptionist underTest = new Receptionist ("Test Receptionist");
		int result = underTest.getReceptionistIdentificationNumer(); 
			assertThat(result, is(777));
		}
	@Test
	public void shouldCheckIfReceptionistWasPaid () {
		Receptionist underTest = new Receptionist ("Test Receptionist");
		boolean result = underTest.getReceptionistPaid (false);
}
}