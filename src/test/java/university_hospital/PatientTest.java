package university_hospital;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class PatientTest {
	
	@Test
	public void patientShouldHaveName() {
		Patient underTest = new Patient ("Bob");
		String result = underTest.getName();
		assertThat(result, is("Bob"));
	}
	@Test
	public void retrieveBloodLevel() {
		Patient underTest = new Patient ("Test Patient");
		String result = underTest.getName();
		int bloodLevel = underTest.getBloodLevel();
		
	}
	@Test
	public void retrieveHealthLevel() {
		Patient underTest = new Patient ("Test Patient");
		String result = underTest.getName();
		int healthLevel = underTest.getHealthLevel();
		
	}

}
