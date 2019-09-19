package university_hospital;

public class Doctor extends Employee {
	

	private int salary;
	private int identificationNumber;
	
	public Doctor(String name) {
		super(name);
		setDoctorSalary(90000);
		setDoctorIdentificationNumber(999);
		
	}


	
	public int getDoctorIdentificationNumber() {
		return identificationNumber;
	}
	public void setDoctorIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public int getDoctorSalary() {
		return salary;
	}
	public void setDoctorSalary(int salary) {
		this.salary = salary;
	}

	}


