package university_hospital;

public class Janitor extends Employee {

	public Janitor(String name) {
		super(name);
		
	}

	public int getJanitorSalary() {
		return 40000;
	}

	public int getJanitorIdentificationNumer() {
		return 666;
	}

	public boolean getJanitorPaid(boolean ifPaid) {
		return false;
	}

}
