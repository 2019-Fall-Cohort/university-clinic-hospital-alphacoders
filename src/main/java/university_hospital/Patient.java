package university_hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Patient {
	
	private String name;
	private int BloodLevel = 20;
	private int HealthLevel = 10;
	
	
	public Patient(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Patient: " + name;
	}
	
	public String getName() {
		return name;
	}
	public int getBloodLevel() {
		return BloodLevel;
		
	}
	public int getHealthLevel() {
		return HealthLevel;
		
	}
	public void displayPatientAttributes () {
		System.out.println("");
		System.out.print(String.format("|%-10s",  "BloodLevel" + BloodLevel));
		System.out.print(String.format("|%-10s",  "HealthLevel" + HealthLevel));
		System.out.println("");
	}
		
	}
	
	

	


	
