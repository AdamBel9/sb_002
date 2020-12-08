package dz.ibnrochd.master14.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.business.IConsultationService;
import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;

@Service
public class ConsultationService implements IConsultationService{

	
//Injection 
	ConsultationRepository consultationRepository ;
	PatientRepository patientRepository ;
	
	//Constructor
	
	@Autowired
	public ConsultationService(ConsultationRepository consultationRepository) {
		this.consultationRepository = consultationRepository;
		
	}
	//Method 
	public Consultation creeConsultation(int id, String motif, Date dateConsultation, Patient patient) {
		
		Patient  pat= patientRepository.findById(patient.getId);
		return consultationRepository.save(new Consultation(id ,motif , dateConsultation ,pat));
		
	}
	
	public List<Consultation> listConsultation(){
		return consultationRepository.findAll(); 
	}
	
	public List<Consultation> supprimierConsultation(int id){
		consultationRepository.deleteById(id);
		return consultationRepository.findAll();
	}
}
