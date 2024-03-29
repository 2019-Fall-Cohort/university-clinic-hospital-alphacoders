package university_hospital;

import java.util.Random;
import java.util.Scanner;

public class UniversityHospitalApp {

	static HospitalWard hospitalWard = new HospitalWard();
	static Doctor doctor = new Doctor("Dr Bloch, Cardiovascular MD");
	static Janitor janitor = new Janitor("Fred");
	static Nurse nurse = new Nurse("Jackie, BSN");
	static Receptionist receptionist = new Receptionist("Stacy");
	static Patient patient = new Patient("");
	static Employee employee = new Employee("");
	private static Scanner userInput = new Scanner(System.in);
	private static String name;
	static boolean stayInMenu = true;
	static Random rand = new Random();

	public static void main(String[] args) {

		hospitalWard.addEmployeeToHospitalWard(doctor);
		hospitalWard.addEmployeeToHospitalWard(janitor);
		hospitalWard.addEmployeeToHospitalWard(nurse);
		hospitalWard.addEmployeeToHospitalWard(receptionist);

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
		System.out.println("3. Display all employee stats.");
		System.out.println("4. Have Doctor treat patient.");
		System.out.println("5. Have nurse make rounds on all patients.");
		System.out.println("6. Check if janitor is sweeping.");
		System.out.println("7. Show if Receptionist is on the phone.");
		System.out.println("8. Pay a specific Employee.");
		System.out.println("9. Type to close application");
	}

	private static void addANewPatient() {
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
			displayEmployeeAttributes();
			break;
		case 4:
			interactWithOnePatient();
			break;
		case 5:
			interactWithAllPatients();
			break;
		case 6:
			showIfJanitorIsSweeping();
			break;
		case 7:
			showIfReceptionistIsOnThePhone();
			break;
		case 8:
			payEmployee();
			break;

		case 9:
			stayInMenu = false;
			System.out.println("Goodbye.");
			System.exit(0);

		}
	}

	private static void displayAllPatientAttributes() {
		System.out.print(String.format("|%-10s", "Name"));
		System.out.print(String.format("|%-10s", "BloodLevel"));
		System.out.print(String.format("|%-10s", "HealthLevel"));
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		UniversityHospitalApp.name = name;
	}

	private static void displayEmployeeAttributes() {
		System.out.println("Doctors:");
		System.out.print(String.format("|%-28s", "Name"));
		System.out.print(String.format("|%-28s", "Identification#"));
		System.out.print(String.format("|%-28s", "Salary"));
		System.out.print(String.format("|%-28s|", "PayCheck"));
		System.out.println();
		hospitalWard.retrieveDoctorAttributes();
		System.out.println();

		System.out.println("Janitors:");
		System.out.print(String.format("|%-28s", "Name"));
		System.out.print(String.format("|%-28s", "Identification#"));
		System.out.print(String.format("|%-28s", "Salary"));
		System.out.print(String.format("|%-28s|", "PayCheck"));
		System.out.println();
		hospitalWard.retrieveJanitorAttributes();
		System.out.println();

		System.out.println("Nurse:");
		System.out.print(String.format("|%-28s", "Name"));
		System.out.print(String.format("|%-28s", "Identification#"));
		System.out.print(String.format("|%-28s", "Salary"));
		System.out.print(String.format("|%-28s|", "PayCheck"));
		System.out.println();
		hospitalWard.retrieveNurseAttributes();
		System.out.println();

		System.out.println("Receptionist:");
		System.out.print(String.format("|%-28s", "Name"));
		System.out.print(String.format("|%-28s", "Identification#"));
		System.out.print(String.format("|%-28s", "Salary"));
		System.out.print(String.format("|%-28s|", "PayCheck"));
		System.out.println();
		hospitalWard.retrieveReceptionistAttributes();
		System.out.println();
	}

	private static void interactWithOnePatient() {
		System.out.println("Which patient would you like the Doctor to treat?");
		System.out.println(hospitalWard.retrievePatientList());
		String patientName = userInput.nextLine();
		Patient selectedPatient = hospitalWard.retrievePatient(patientName);
		userInput.nextLine();
		System.out.println("");

		stayInMenu = true;
		while (stayInMenu) {
			patient.displayPatientAttributes();
			System.out.println("");
			System.out.println("Hit 1 to give blood and 2 to treat patient. (Hit 3 To Exit)");
			int response = userInput.nextInt();
			determineUserResponseForTreatingPatient(response, selectedPatient);
		}

	}

	private static void determineUserResponseForTreatingPatient(int response, Patient selectedPatient) {

		int amount = 0;
		switch (response) {
		case 1:
			System.out.println("How much blood would you like to draw from?");
			amount = userInput.nextInt();
			userInput.nextLine();
			patient.giveBlood(amount);
			break;

		case 2:
			System.out.println("How much would you like to treat patient?");
			amount = userInput.nextInt();
			userInput.nextLine();
			patient.treatHealth(amount);
			break;
		case 3:
			stayInMenu = false;
			break;
		}
	}

	private static void interactWithAllPatients() {
		int amount = 0;
		stayInMenu = true;

		while (stayInMenu) {
			displayAllPatientAttributes();
			hospitalWard.retrieveAllPatientAttributes();
			System.out.println("");
			System.out.println(
					"How much would you like the nurst to get blood or treat patient? (Hit 1 to give blood, 2 to treat, and 3 to back out.)");
			int response = userInput.nextInt();
			switch (response) {
			case 1:
				System.out.println("How much blood would you like the nurse to take?");
				amount = userInput.nextInt();
				userInput.nextLine();
				hospitalWard.allPatientsGiveBlood(amount);
				break;
			case 2:
				System.out.println("How much would you like the nurse to treat the patient?");
				amount = userInput.nextInt();
				userInput.nextLine();
				hospitalWard.allPatientsToTreat(amount);
				break;
			case 3:
				stayInMenu = false;
				break;
			}
		}
	}

	private static void showIfJanitorIsSweeping() {
		Random number = new Random();
		final int Max = 2;
		int random;

		random = rand.nextInt(Max) + 1;

		if (random == 1) {
			System.out.println("Janitor is sweeping.");
		} else {
			System.out.println("Janitor is not sweeping.");
		}
	}

	private static void showIfReceptionistIsOnThePhone() {
		Random number = new Random();
		final int Max = 2;
		int random;

		random = rand.nextInt(Max) + 1;

		if (random == 1) {
			System.out.println("Receptionist is on the phone.");
		} else {
			System.out.println("Receptionist is off the phone.");
		}
	}
	private static void payEmployee () {
		System.out.println("Pick an employee to get paid.");
		String userSelection2 = userInput.nextLine();
		userInput.nextLine();
		if (userSelection2 == "Dr Bloch"); {
		employee.getPaid();		
		displayEmployeeAttributes();
		} if (userSelection2 == "Jackie"); {
			employee.getPaid();		
			displayEmployeeAttributes();
		} if (userSelection2 == "Fred"); {
			employee.getPaid();		
			displayEmployeeAttributes();
		} if (userSelection2 == "Stacy"); {
			employee.getPaid();		
			displayEmployeeAttributes();
		}
	}

}
