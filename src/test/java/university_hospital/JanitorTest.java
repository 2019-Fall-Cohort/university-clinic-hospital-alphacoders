package university_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class JanitorTest {
	
	@Test
	public void janitorShouldBeAnEmployee()  {
		Employee underTest = new Janitor ("Test Janitor");
		String result = underTest.getName();
		assertThat(result, is("Test Janitor"));
}
	@Test
	public void janitorShouldShowSalary() {
		Janitor underTest = new Janitor ("Test Janitor");
		int result = underTest.getJanitorSalary();
		assertThat(result, is(40000));
	}
	@Test
	public void janitorShouldHaveIdentificationNumber() {
		Janitor underTest = new Janitor ("Test Janitor");
		int result = underTest.getJanitorIdentificationNumer(); 
			assertThat(result, is(666));
		}
	@Test
	public void shouldCheckIfJanitorWasPaid () {
		Janitor underTest = new Janitor ("Test Janitor");
		boolean result = underTest.getJanitorPaid (false);
}
}