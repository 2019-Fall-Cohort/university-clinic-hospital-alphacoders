package university_hospital;

public class Nurse extends Employee {

	private int salary;
	private int identificationNumber;

	public Nurse(String name) {
		super(name);
		setNurseSalary(50000);
		setNurseIdentificationNumber(888);

	}

	public void setNurseSalary(int salary) {
		this.salary = salary;

	}

	public int getNurseIdentificationNumber() {
		return identificationNumber;
	}

	public int getNurseSalary() {
		return salary;
	}

	public void setNurseIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

}