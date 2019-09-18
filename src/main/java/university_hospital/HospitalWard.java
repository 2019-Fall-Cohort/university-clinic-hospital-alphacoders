package university_hospital;

import java.util.Collection;
import java.util.HashMap;

public class HospitalWard  {

	HashMap<String, Patient> patientList;

	public HospitalWard() {
		patientList = new HashMap<>();
	}

	public void addPatientToHospitalWard(Patient patientToAdd) {
		patientList.put(patientToAdd.getName(), patientToAdd);
	}

	public Collection<Patient> retrievePatientList() {

		return patientList.values();
	}
	public Patient retrievePatient(String patientName) {
		return patientList.get(patientName);
	}
	public String [] retrieveAllPatientAttributes() {
		
		String [] allPatientAttributes = new String[patientList.size()];
		String arrayRow = "";
		
		for (Patient patient:  patientList.values()) {
			System.out.println("");
			arrayRow = (String.format("|%-10s",  patient.getName())) +
				(String.format("|%-10d",  patient.getBloodLevel())) +
				(String.format("|%-10d",  patient.getHealthLevel()));
			System.out.println(arrayRow);
		}
		return allPatientAttributes;
		}
	
		
	}


