package _04_hospital;

public class Patient {
	boolean cared;
	
	public Patient() {
		cared = false;
	}
	public void checkPulse() {
		cared = true;
	}
	public boolean feelsCaredFor() {
		if (cared) {
			return true;
		}
		else
			return false;
	}
	public void setCared(boolean care) {
		cared = care;
	}
}
