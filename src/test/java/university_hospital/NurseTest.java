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
	@Test
    public void doctorShouldShowSalary() {
        Nurse underTest = new Nurse ("Test Nurse");
        int result = underTest.getNurseSalary();
        assertThat(result, is(50000));
    }
    @Test
    public void nurseShouldHaveIdentificationNumber() {
        Nurse underTest = new Nurse ("Test Nurse");
        int result = underTest.getNurseIdentificationNumer();
            assertThat(result, is(888));
        }
    @Test
    public void shouldCheckIfDoctorWasPaid () {
        Nurse underTest = new Nurse ("Test Nurse");
        boolean result = underTest.getNursePaid (false);
}
}