package dz.ibnrochd.master14.business;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;

@Service
public interface IConsultationService {

	//Create Consultation
	public Consultation creeConsultation(int id, String motif, Date dateConsultation, Patient patient);
	
	//Display all consultation
	public List<Consultation> listConsultation();
	
	//Delete a Consultation 
	public List<Consultation> supprimierConsultation(int id);
	
	
	
}


