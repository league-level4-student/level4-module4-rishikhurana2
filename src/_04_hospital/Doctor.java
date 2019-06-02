package _04_hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> patients;
	
	public Doctor() {
		patients = new ArrayList<>();
	}
	public void assignPatient(Patient p) {
		patients.add(p);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public abstract boolean performsSurgery();
	public abstract boolean makesHouseCalls();
}