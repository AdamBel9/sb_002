package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Traitement;

@Service
public interface ITraitementService {
	
	//Create treatment
	public Traitement creeTraitement(int id, String nom);
	
	//Display all treatment
	public List<Traitement> listTraitement();
	
	//Delete treatment 
	public List<Traitement> supprimierTraitement(int id );

}
