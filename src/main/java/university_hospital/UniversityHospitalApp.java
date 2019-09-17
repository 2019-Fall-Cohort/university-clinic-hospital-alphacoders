package university_hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversityHospitalApp {
	
	static HospitalWard hospitalWard = new HospitalWard();
	private static Scanner userInput = new Scanner(System.in);
	private static String name;
	static boolean stayInMenu = true;

	public static void main(String[] args) {

		System.out.println("Welcome to University Hospital!");
		System.out.println("");
	stayInMenu = true;
	while (true) {
		displayMainMenu();
		determineMenuAction();
		
			
		}
	}
	private static void displayMainMenu() {
		System.out.println("Please choose an option");
		System.out.println("1. Add a patient to the hospital.");
		System.out.println("2. Display all patients and there health.");
		System.out.println("3. Type to close application");
	}
	
	private static void addANewPatient () {
		System.out.println("Who would you like to add to our university hospital?");
		userInput.nextLine();
		String patientName = userInput.nextLine();
		Patient patient = new Patient(patientName);
		hospitalWard.addPatientToHospitalWard(patient);
	}
	
	
	private static void determineMenuAction() {
		int userSelection = userInput.nextInt();
		userInput.hasNextLine();
		
		switch (userSelection) {
		case 1:
			addANewPatient();
			break;
			
		case 2:
			displayAllPatientAttributes();
			hospitalWard.retrieveAllPatientAttributes();
			break;
		case 3:
			stayInMenu = false;
			System.out.println("Goodbye.");
			System.exit(0);
					
		}
	}
	private static void displayAllPatientAttributes() {
		System.out.print(String.format("|%-10s",  "Name"));
		System.out.print(String.format("|%-10s",  "BloodLevel"));
		System.out.print(String.format("|%-10s",  "HealthLevel"));
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		UniversityHospitalApp.name = name;
	}

}
