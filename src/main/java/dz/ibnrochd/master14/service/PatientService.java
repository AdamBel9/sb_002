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
	  public Patient creePatient(Patient patient) {
		 return patientRepository.save(patient);
		  
				 }
	  
					/*
					 * //Update patient public Patient modfierPatient(Patient patient) { return
					 * patientRepository.save(patient); }
					 */
	  //Read patient
	  public List<Patient> listToutPatient(){
		  return patientRepository.findAll();
		  
	  }
	  
	  //Update patient
	  public void misAJourPateint(Patient patient) {
		  
		patientRepository.save(patient);
		  
	  }
	  
	  //Delete patient
	 public void supprimerPatient(int id ) {
		 patientRepository.deleteById(id);
		
		 
	 }


	
		  
}
