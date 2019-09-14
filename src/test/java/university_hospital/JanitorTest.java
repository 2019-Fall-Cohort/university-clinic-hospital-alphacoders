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
}