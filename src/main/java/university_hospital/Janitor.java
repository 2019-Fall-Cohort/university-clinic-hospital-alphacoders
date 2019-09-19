package university_hospital;

public class Janitor extends Employee {
	
	private int salary;
	private int identificationNumber;

	public Janitor(String name) {
		super(name);
		setJanitorSalary(40000);
		setJanitorIdentificationNumber(666);
		
	}

	private void setJanitorIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
		
	}

	private void setJanitorSalary(int salary) {
		this.salary = salary;
		
	}

	public int getJanitorSalary() {
		return salary;
	}

	public int getJanitorIdentificationNumer() {
		return identificationNumber;
	}



}
