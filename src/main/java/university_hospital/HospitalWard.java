package university_hospital;

import java.util.Collection;
import java.util.HashMap;

public class HospitalWard {

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

	public String[] retrieveAllPatientAttributes() {

		String[] allPatientAttributes = new String[patientList.size()];
		String arrayRow = "";

		for (Patient patient : patientList.values()) {
			System.out.println("");
			arrayRow = (String.format("|%-10s", patient.getName())) + (String.format("|%-10d", patient.getBloodLevel()))
					+ (String.format("|%-10d", patient.getHealthLevel()));
			System.out.println(arrayRow);
		}
		return allPatientAttributes;
	}

	public Collection<Employee> retrieveEmployeeList() {
		return employeeList.values();
	}

	public void retrieveDoctorAttributes() {

		String arrayRow = "";

		for (Employee employee : employeeList.values()) {
			if (employee instanceof Doctor) {
				Doctor doctor = (Doctor) employee;
				arrayRow = (String.format("|%-15s", doctor.getName()))
						+ (String.format("|%-15s", doctor.getDoctorIdentificationNumber()))
						+ (String.format("|%-15s", doctor.getDoctorSalary()))
						+ (String.format("|%-15s|", doctor.getPaid()));
				System.out.println(arrayRow);
			}
		}
	}

	public void retrieveJanitorAttributes() {

		String arrayRow = "";

		for (Employee employee : employeeList.values()) {
			if (employee instanceof Janitor) {
				Janitor janitor = (Janitor) employee;
				arrayRow = (String.format("|%-15s", janitor.getName()))
						+ (String.format("|%-15s", janitor.getJanitorIdentificationNumer()))
						+ (String.format("|%-15s", janitor.getJanitorSalary()))
						+ (String.format("|%-15s|", janitor.getPaid()));
				System.out.println(arrayRow);
			}
		}
	}

	public void retrieveNurseAttributes() {

		String arrayRow = "";

		for (Employee employee : employeeList.values()) {
			if (employee instanceof Nurse) {
				Nurse nurse = (Nurse) employee;
				arrayRow = (String.format("|%-15s", nurse.getName()))
						+ (String.format("|%-15s", nurse.getNurseIdentificationNumber()))
						+ (String.format("|%-15s", nurse.getNurseSalary()))
						+ (String.format("|%-15s|", nurse.getPaid()));
				System.out.println(arrayRow);
			}
		}
	}

	public void retrieveReceptionistAttributes() {

		String arrayRow = "";

		for (Employee employee : employeeList.values()) {
			if (employee instanceof Receptionist) {
				Receptionist receptionist = (Receptionist) employee;
				arrayRow = (String.format("|%-15s", receptionist.getName()))
						+ (String.format("|%-15s", receptionist.getReceptionistIdentificationNumer()))
						+ (String.format("|%-15s", receptionist.getReceptionistSalary()))
						+ (String.format("|%-15s|", receptionist.getPaid()));
				System.out.println(arrayRow);
				
			}
		}
	}

	public void displayPatientAttributes() {
		
		
	}
}
