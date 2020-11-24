package dz.ibnrochd.master14.business;

import java.util.Date;
import java.util.List;



import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;


public interface IConsultationService {

	//Create Consultation
	public Consultation creeConsultation(int id, String motif, Date dateConsultation, int idPatient);
	
	//Display all consultation
	public List<Consultation> listConsultation();
	
	//Delete a Consultation 
	public void supprimierConsultation(int id);
	
	
	
}


