package university_hospital;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;





import org.junit.Test;



public class PatientTest {

	@Test
	public void patientToStringShouldReferToPatientName() {
		Patient underTest = new Patient ("Test Name");
		assertEquals("Patient: Test Name", underTest.toString());
	}
	@Test
	public void patientGivesBlood() {
		Patient underTest = new Patient ("Bob");
		underTest.giveBlood(8);
		int expected = underTest.getBloodLevel();
		assertEquals(expected, 12);
		
	}
	
	
	}

		
	
	


