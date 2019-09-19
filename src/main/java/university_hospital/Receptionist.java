package university_hospital;

public class Receptionist extends Employee {
	
	private int salary;
	private int identificationNumber;

	public Receptionist(String name) {
		super(name);
		setReceptionistSalary(45000);
		setReceptionistIdentificationNumber(777);
		
	}

	public void setReceptionistIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
		
	}

	public void setReceptionistSalary(int salary) {
		this.salary = salary;
		
	}

	public int getReceptionistSalary() {
		return salary;
	}

	public int getReceptionistIdentificationNumer() {
		return identificationNumber;
	}


}
