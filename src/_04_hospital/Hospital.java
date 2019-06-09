package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	public Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void addPatient(Patient p) {
		patients.add(p);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void assignPatientsToDoctors() throws DoctorFullException {
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = 0; j < patients.size(); j++) {
				doctors.get(i).assignPatient(patients.get(j));
				if (doctors.get(i).getPatients().size() == 3) {
					i = i + 1;
				}
			}
		}
	}
}
