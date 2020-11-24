package dz.ibnrochd.master14.business;

import java.util.List;



import dz.ibnrochd.master14.model.Traitement;

public interface ITraitementService {
	
	//Create treatment
	public Traitement creeTraitement(Traitement traitement);
	
	//Display all treatment
	public List<Traitement> listTraitement();
	
	//Delete treatment 
	public void supprimierTraitement(int id );

}
