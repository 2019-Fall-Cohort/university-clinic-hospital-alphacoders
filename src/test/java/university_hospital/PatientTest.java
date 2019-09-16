package university_hospital;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;



public class PatientTest {

	@Test
	public void patientToStringShouldReferToPatientName() {
		Patient underTest = new Patient ("Test Name");
		assertEquals("Patient: Test Name", underTest.toString());
	}
	
	}

		
	
	


