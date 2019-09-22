package university_hospital;

import java.util.Scanner;


public class Employee {
	private static Scanner userInput = new Scanner(System.in);

	private String name;
	

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return 0;
	}

	public int getIdentificationNumber() {
		return 0;
	}
	

	public String getPaid() {
		int number = 1;
		if (number == 1) {
		return "false";
	} else {
		return "true";
	}
	}
}

