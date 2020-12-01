/*
 * package dz.ibnrochd.master14.api;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RestController; import
 * dz.ibnrochd.master14.business.IConsultationService; import
 * dz.ibnrochd.master14.business.IPatientService; import
 * dz.ibnrochd.master14.business.ITraitementService; import
 * dz.ibnrochd.master14.model.Patient; import
 * dz.ibnrochd.master14.model.Traitement;
 * 
 * @RestController public class ServiceRest {
 * 
 * //Field private IPatientService iPatientService ;
 * 
 * private ITraitementService iTraitmentService ;
 * 
 * private IConsultationService iConsultationService ;
 * 
 * //Constructor
 * 
 * @Autowired public ServiceRest(IPatientService iPatientService,
 * ITraitementService iTraitmentService, IConsultationService
 * iConsultationService) { this.iPatientService = iPatientService;
 * this.iTraitmentService = iTraitmentService; }
 * 
 * //Create a patient
 * 
 * @RequestMapping (value = {"/api/patients"},method = RequestMethod.GET) public
 * ResponseEntity<Object> afficherListPatient() { List<Patient> liste =
 * iPatientService.listToutPatient(); return new ResponseEntity<>(liste
 * ,HttpStatus.OK); }
 * 
 * //Add a patient
 * 
 * 
 * @RequestMapping (value = {"/api/patients"},method = RequestMethod.POST)
 * public ResponseEntity<Object> ajouterPatient1(@RequestBody Patient patient) {
 * iPatientService.creePatient(patient); return new
 * ResponseEntity<>("Patient created with sucess!",HttpStatus.CREATED);
 * 
 * }
 * 
 * //Delete a patient
 * 
 * @RequestMapping (value = {"/api/patients/{id}"},method =
 * RequestMethod.DELETE) public ResponseEntity<Object>
 * supprimierPatient(@PathVariable("id") int id) {
 * iPatientService.supprimerPatient(id); return new
 * ResponseEntity<>("Delete patient with sucess!",HttpStatus.OK); }
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
 * } }
 */