package university_hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Patient {
	
	private String name;
	int minValue = 0;
	int maxValue = 100;
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

	public void giveBlood(int amount) {
		int newBloodLevel = BloodLevel - amount;
		
		if (attributeWithinRange(newBloodLevel)) {
			setBloodLevel(newBloodLevel);
		} else {
			setBloodLevel(minValue);
		}
		
		
		
		
	}
	private void setBloodLevel(int BloodLevel) {
		this.BloodLevel = BloodLevel;
		
	}

	public boolean attributeWithinRange(int attribute) {

		boolean isWithinRange = true;

		if (attribute < minValue) {
			isWithinRange = false;
		}

		if (attribute > maxValue) {
			isWithinRange = false;
		}

		return isWithinRange;
	}

	public void treatHealth(int amount) {
		int newHealthLevel = HealthLevel + amount;
		
		if (attributeWithinRange(newHealthLevel)) {
			setHealthLevel(newHealthLevel);
		} else {
			setHealthLevel(maxValue);
			
		}
		
	}

	private void setHealthLevel(int HealthLevel) {
		this.HealthLevel = HealthLevel;
		
	}
		
	}
	
	

	


	
