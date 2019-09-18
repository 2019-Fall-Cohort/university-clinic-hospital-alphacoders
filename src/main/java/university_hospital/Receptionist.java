package university_hospital;

public class Receptionist extends Employee {

	public Receptionist(String name) {
		super(name);
		
	}

	public int getReceptionistSalary() {
		return 45000;
	}

	public int getReceptionistIdentificationNumer() {
		return 777;
	}

	public boolean getReceptionistPaid(boolean ifPaid) {
		return false;
	}

}
