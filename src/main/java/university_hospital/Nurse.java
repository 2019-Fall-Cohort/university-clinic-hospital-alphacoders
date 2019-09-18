package university_hospital;

public class Nurse extends Employee {

	public Nurse(String name) {
		super(name);
		
	}
	 public int getNurseIdentificationNumer() {
	        return 888;
	    }
	    public int getNurseSalary() {
	        return 50000;
	    }
	    public boolean getNursePaid(boolean b) {
	        return false;

}
}