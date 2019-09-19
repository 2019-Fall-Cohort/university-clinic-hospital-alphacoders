package university_hospital;

import java.util.Collection;
import java.util.HashMap;

public class HospitalWard  {

	HashMap<String, Patient> patientList;
	HashMap<String, Employee> employeeList;

	public HospitalWard() {
		patientList = new HashMap<>();
		employeeList = new HashMap<>();
	}

	public void addPatientToHospitalWard(Patient patientToAdd) {
		patientList.put(patientToAdd.getName(), patientToAdd);
	}
	public void addEmployeeToHospitalWard(Employee employeeToAdd) {
		employeeList.put(employeeToAdd.getName(), employeeToAdd);
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
	
	public Collection<Employee> retrieveEmployeeList() {
		return employeeList.values();
	}

	public void retrieveEmployeeAttributes () {
		
		String arrayRow = "";
		
		for (Employee employee : employeeList.values()) {
			if (employee instanceof Doctor) {
				Doctor doctor = (Doctor) employee;
				arrayRow = (String.format("|%-10s", doctor.getName()))
				+ (String.format("|%-10s", doctor.getDoctorIdentificationNumber()))
				+ (String.format("|%-10s", doctor.getDoctorSalary()))
				+ (String.format("|%-10s", doctor.getPaid()));
			}
			System.out.println(arrayRow);
		}
	}

	

	}
		
	


