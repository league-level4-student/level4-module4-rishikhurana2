package _04_hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> patients;
	
	public Doctor() {
		patients = new ArrayList<>();
	}
	public void assignPatient(Patient p) throws DoctorFullException{
		patients.add(p);
		if (patients.size() > 3) {
			patients.remove(3);
			throw new DoctorFullException();
		}
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public abstract boolean performsSurgery();
	public abstract boolean makesHouseCalls();
	public  void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).setCared(true);
		}
	}
}