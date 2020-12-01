package dz.ibnrochd.master14.api;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderDsl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.business.ITraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;


@RestController
public class ServiceRestHateoas {

	
	

		//Field
		private IPatientService iPatientService ;
		
		private ITraitementService iTraitmentService ; 
		
		

		//Constructor 
		
		@Autowired
		public ServiceRestHateoas(IPatientService iPatientService, ITraitementService iTraitmentService
				) {
			this.iPatientService = iPatientService;
			this.iTraitmentService = iTraitmentService;
			
		}
		
		@GetMapping (value = {"/api/patients"})
		public List<Patient>  afficherListPatient() { 
			List<Patient> liste = iPatientService.listToutPatient(); 
			return liste; 
		  }
	
		 
		 @GetMapping (value = {"/api/patients/{id}"})
		  public EntityModel<Patient> afficherPatientId(@PathVariable("id") int id){
			  Patient pat = iPatientService.patientId(id);
			  EntityModel<Patient> model = EntityModel.of(pat);
			  model.add(Link.of("/api/patients").withRel("liste-Patient"));
			  return model ;
			  
		  }
		 
	
		//Add(Create) a patient
		 @PostMapping (value = {"/api/patients"}) 
		 public ResponseEntity<Object> ajouterPatient1( @RequestBody Patient patient) { 
			 Patient pat=iPatientService.creePatient(patient); 
			 URI chemin = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pat.getId()).toUri();
		 return ResponseEntity.created(chemin).build();
		 }
		/*
		 * @PostMapping (value = {"/api/patients"}) public ResponseEntity<Object>
		 * ajouterPatient1( @RequestBody Patient patient) { Patient pat
		 * =iPatientService.creePatient(patient); return new
		 * ResponseEntity<>("Patient created with sucess!",HttpStatus.CREATED);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * //Delete a patient
		 * 
		 * @RequestMapping (value = {"/api/patients/{id}"},method =
		 * RequestMethod.DELETE) public void supprimierPatient(@PathVariable("id") int
		 * id) { iPatientService.supprimerPatient(id);
		 * 
		 * }
		 * 
		 * //Treatment
		 * 
		 * //Create a treament
		 * 
		 * @RequestMapping (value = {"/api/traitments"},method = RequestMethod.GET)
		 * public ResponseEntity<Object> afficherTaitement() { List<Traitement> listeT =
		 * iTraitmentService.listTraitement(); return new ResponseEntity<>(listeT ,
		 * HttpStatus.OK) ; }
		 * 
		 * //Add a treatment
		 * 
		 * @RequestMapping (value = {"/api/traitments"}, method = RequestMethod.POST)
		 * public ResponseEntity<Object> ajouterTraitement1(@RequestBody Traitement
		 * traitement) { iTraitmentService.creeTraitement(traitement); return new
		 * ResponseEntity<>("Add treatment sucess!" , HttpStatus.CREATED); }
		 * 
		 * //Delete a treatment
		 * 
		 * @RequestMapping (value = {"/api/traitments/{id}"}, method =
		 * RequestMethod.DELETE) public ResponseEntity<Object>
		 * suppriemerTraitement(@PathVariable("id") int id) {
		 * iTraitmentService.supprimierTraitement(id); return new
		 * ResponseEntity<>("Treatment deleted by sucess !!", HttpStatus.OK);
		 * 
		 * }
		 */
	}
