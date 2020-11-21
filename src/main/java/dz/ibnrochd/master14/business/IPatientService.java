package dz.ibnrochd.master14.business;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Patient;


@Service
public interface IPatientService {
	 //Create patient
	  public Patient creePatient( int id ,String nom, String prenom, String sexe, Date dateNaissance, String numeroTelephone,
				String adresse);
	 
	 //Display all  patient
	  public List<Patient> listToutPatient();
	  
	 //Delete a patients
	  public List<Patient> supprimerPatient(int id);
}
