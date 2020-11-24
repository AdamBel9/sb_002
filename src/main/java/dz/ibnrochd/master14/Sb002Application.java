package dz.ibnrochd.master14;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.RendezVousRepositroy;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.service.PatientService;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	/*
	 * @Autowired PatientRepository patientRepository;
	 * 
	 * @Autowired RendezVousRepositroy rendezVousRepository ;
	 * 
	 * @Autowired TraitementRepository traitementRepo ;
	 * 
	 * @Autowired ConsultationRepository consultationRepository ;
	 * 
	 * @Autowired LigneConsultationRepository ligneConsultationRepository ;
	 */
	@Autowired
	PatientService p ;
	
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//System.out.println(p.);
		
		//Patient pe = new Patient(12, "Belabessi", "sisila", "f", "10/01/1990", "58456866", "Blida");
		//p.creePatient(pe);
		//Patient pe1 = new Patient(12, "Belabessi", "Adam", "m", "10/01/1990", "58456866", "Blida");
		//p.creePatient(pe1);
		//Patient pe2 = new Patient(12, "Belabessi", "Kaled", "m", "10/01/1990", "58456866", "Blida");
		//p.creePatient(pe2);
		//p.listToutPatient().forEach(p -> System.out.println(p));
		//p.supprimerPatient(10);
		/*
		 * // TODO : récupérer la liste de tous les patients puis afficher leurs noms
		 * System.out.println("la liste de tous les patients");
		 * patientRepository.findAll().forEach(p-> System.out.println(p.getNom())); //
		 * TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		 * System.out.println(); System.out.println();
		 * System.out.println("les patients ayant le nom Belabessi : " );
		 * 
		 * 
		 * patientRepository.findByNom("Belabessi").forEach(p ->
		 * System.out.println(p.getPrenom())); // TODO : créer un nouveau patient
		 * (valeurs au choix) PUIS enregistrer-le
		 * 
		 * System.out.println(); System.out.println();
		 * System.out.println("Creation d'un nouveux patient ...");
		 * 
		 * Patient p = new Patient(8,"Belabessi", "Khaled", "m", new Date(93,3,17),
		 * "0555755731","blida"); patientRepository.save(p);
		 * 
		 * // TODO : rechercher la consultation ayant id=3 System.out.println();
		 * System.out.println();
		 * System.out.println("Rechercher la consultation ayant id=3");
		 * 
		 * Consultation c = consultationRepository.findById(3); System.out.println(c);
		 * 
		 * System.out.println(); System.out.println();
		 * System.out.println("les noms des médicaments : "); // TODO : parcourir les
		 * lignes de la consultation trouvée et afficher les noms des médicaments
		 * traitementRepo.findAll().forEach(t -> System.out.println(t.getNom()));
		 */
		
	}

}
