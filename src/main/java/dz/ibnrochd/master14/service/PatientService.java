package dz.ibnrochd.master14.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;

@Service
public class PatientService implements IPatientService{
	
	private PatientRepository patientRepository ;
	
	//Constructor
	@Autowired
	public PatientService(PatientRepository patientRepository){
		this.patientRepository =  patientRepository;
	}
	
	
	//Methods CRUD
	//Create patient
	  public Patient creePatient( int id ,String nom, String prenom, String sexe, Date dateNaissance, String numeroTelephone,
				String adresse) {
		 return patientRepository.save(new Patient(id , nom,prenom,sexe,dateNaissance,numeroTelephone,adresse));
	  }
	  
	  //Read patient
	  public List<Patient> listToutPatient(){
		  return patientRepository.findAll();
		  
	  }
	  
	 public List<Patient> supprimerPatient(int id) {
		 patientRepository.deleteById(id);
		 return patientRepository.findAll();
		 
	 }
		  
}
