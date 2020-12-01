package dz.ibnrochd.master14.business;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import dz.ibnrochd.master14.model.Patient;



public interface IPatientService {
	 //Create patient
	  public Patient creePatient( Patient patient);
	 
	 //Display all  patient
	  public List<Patient> listToutPatient();
	  
	 //Delete a patients
	  public void supprimerPatient(int id);
	  
	  //Patient by ID
	  public Patient patientId(int id ) ;
}
