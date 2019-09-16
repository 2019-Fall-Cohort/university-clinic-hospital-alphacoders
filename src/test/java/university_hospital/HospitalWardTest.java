package university_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

public class HospitalWardTest {
	
	@Test
	public void shouldInstantiate()  {
		HospitalWard undertest = new HospitalWard ();
		
	}
	@Test
	public void shouldBeAbleToAddPatient() {
		HospitalWard undertest = new HospitalWard ();
		Patient testpatient = new Patient ("Bob");
		
		undertest.addPatientToHospitalWard(testpatient);
		Collection<Patient> enrolledPatients = undertest.retrievePatientList();
		
		assertThat(enrolledPatients, contains(testpatient));
		
	}
	@Test
	public void shouldBeAbleToAddMultiplePatients() {
		HospitalWard undertest = new HospitalWard ();
		Patient testpatient = new Patient ("Bob");
		Patient testpatient2 = new Patient ("Test2");
		Patient testpatient3 = new Patient ("Test3");
		undertest.addPatientToHospitalWard(testpatient);
		undertest.addPatientToHospitalWard(testpatient2);
		Collection<Patient> enrolledPatients = undertest.retrievePatientList();
		assertThat(enrolledPatients, containsInAnyOrder (testpatient, testpatient2));
		assertThat(enrolledPatients, not(contains(testpatient3)));
	}

}
