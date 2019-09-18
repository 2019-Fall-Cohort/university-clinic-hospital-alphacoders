package university_hospital;

public class Doctor extends Employee {
	
	
	public Doctor(String name) {
		super(name);

	}

	public int getDoctorSalary() {
		return 90000;
	}

	public int getDoctorIdentificationNumer() {
		return 999;
	}

	public boolean getDoctorPaid(boolean paidDoctor) {
		return false;
	}

	}


