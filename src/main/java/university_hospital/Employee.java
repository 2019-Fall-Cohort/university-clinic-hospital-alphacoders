package university_hospital;

import java.util.ArrayList;
import java.util.List;
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

	public boolean getPaid() {
		int userSelection = 1;
		if (userSelection == 0) {
			return true;
		} else {
		return false;
	}
		
	}
}

