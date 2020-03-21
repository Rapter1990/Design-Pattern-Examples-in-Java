package visitorexample;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private List<Patient> getPatients() {
		// TODO Auto-generated method stub
		List<Patient> patients = new ArrayList<>();

		Patient patient1 = new Patient();
		patient1.setName("Patient 1");
		patient1.setHealthStatus("Good");
		patients.add(patient1);

		Patient patient2 = new Patient();
		patient2.setName("Patient 2");
		patient2.setHealthStatus("Bad");
		patients.add(patient2);

		Patient patient3 = new Patient();
		patient3.setName("Patient 3");
		patient3.setHealthStatus("Bad");
		patients.add(patient3);

		Patient patient4 = new Patient();
		patient4.setName("Patient 4");
		patient4.setHealthStatus("Good");
		patients.add(patient4);
		
		return patients;
	}

	public void doCheckUp() {
		Doctor doctor = new Doctor("Doctor Name");
		List<Patient> patients = getPatients();

		for (Patient patient : patients) {
			patient.accept(doctor);
		}
	}
}
