package dz.ibnrochd.master14.business;

import java.util.Date;
import java.util.List;



import dz.ibnrochd.master14.model.Patient;



public interface IPatientService {
	 //Create patient
	  public Patient creePatient( Patient patient);
	 
	 //Display all  patient
	  public List<Patient> listToutPatient();
	  
	 //Delete a patients
	  public void supprimerPatient(int id);
}
