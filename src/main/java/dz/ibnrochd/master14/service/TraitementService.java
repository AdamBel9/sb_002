package dz.ibnrochd.master14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Traitement;

@Service
public class TraitementService {

	//Injection
	TraitementRepository traitementRepository ;
	
	//Constructor
	@Autowired
	public TraitementService(TraitementRepository traitementRepository) {
		// TODO Auto-generated constructor stub
		this.traitementRepository = traitementRepository;
	}
	
	public Traitement creeTraitement(int id, String nom) {
		return traitementRepository.save(new Traitement(id,nom));
	}
	
	public List<Traitement> listTraitement(){
		return traitementRepository.findAll();
	}
	
	public List<Traitement> supprimierTraitement(int id ){
		traitementRepository.deleteById(id);
		return traitementRepository.findAll();
		
	}
}
