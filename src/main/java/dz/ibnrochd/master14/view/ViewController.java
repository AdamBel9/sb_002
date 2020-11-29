package dz.ibnrochd.master14.view;

import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import dz.ibnrochd.master14.business.IConsultationService;
import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.business.ITraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;

@Controller
public class ViewController {
	
	//Injection of services 
	@Autowired
	private IPatientService iPatientService ;
	@Autowired
	private  IConsultationService iConsultationService ;
	@Autowired
	private ITraitementService iTraitement ;
	
	  @Autowired private MessageSource messageSource ;
	 

	//@Value ("${error.message}")
	//private String messageErreur ;
	
	
	
	//Patient
	//Display List of Patient
	
	/*
	 * @GetMapping (path= {"/afficherListPatient"}) public String
	 * afficherListPatient(@RequestHeader(name="fr",required=false) Locale locale) {
	 * return messageSource.getMessage("lsP",null, locale); }
	 */
	 
	  
	 
	@RequestMapping (value = {"/afficherListPatient"},method = RequestMethod.GET)
	public String afficherListPatient1(Model model) {
		model.addAttribute("liste",iPatientService.listToutPatient() );
		return "afficherListPatient";
	}
	
	//Add patient
	@RequestMapping (value = {"/ajouterPatient"},method = RequestMethod.GET)
	  public String ajouterPatient(Model model) {
		model.addAttribute("patient", new Patient());
		return "ajouterPatient";
	  }
	@RequestMapping (value = {"/ajouterPatient"},method = RequestMethod.POST)
	public String ajouterPatient1(Model model,@ModelAttribute ("patient") Patient patient) {
		try {
			iPatientService.creePatient(patient); return "redirect:/ajouterPatient";
		}catch (Exception ex) {
			model.addAttribute("messageErreur", ex.getMessage()); 
			return "ajouterPatient";
		}
		
	//Delete patient 
	}
	
	  @RequestMapping (value = {"/supprimierPatient"},method = RequestMethod.GET)
	  public String supprimierPatient(Model model) {
	  model.addAttribute("liste",iPatientService.listToutPatient() ); return
	  "supprimierPatient";
	}
	 @RequestMapping (value = {"/supprimierPatient"},method = RequestMethod.POST)
	  public String supprimierPatient1(@RequestParam int id) { 
		 try { iPatientService.supprimerPatient(id); 
		 return  "redirect:/afficherListPatient";
		 
		 }catch(Exception ex) 
		 { 
			 return ex.getMessage(); } 	 
	 }
		/*
		 * @RequestMapping (value = {"/misAJourPatient"}, method = RequestMethod.GET)
		 * public String modifierPatient(Model model) { model.addAttribute("liste",
		 * iTraitement.listTraitement()); return "misAJourPatient1" ; }
		 * 
		 * @RequestMapping (value = {"/misAJourPatient1"}, method = RequestMethod.POST)
		 * public String modifierPatient1(Model model,@RequestParam (name="id") int
		 * id,@RequestParam (name="nom") String nom,@RequestParam (name="prenom") String
		 * prenom ,@RequestParam (name="sexe") String sexe,@RequestParam
		 * (name="dateNaissance") Date dateNaissance,@RequestParam
		 * (name="numeroTelephone") String numeroTelephone,@RequestParam
		 * (name="adresse") String adresse) {
		 * 
		 * return "misAJourPatient" ; }
		 */
	 
	 ////////////////////////////////////////////////////////////////////////////////
	 
	 //Display Treatment
	 @RequestMapping (value = {"/afficherListTraitement"},method = RequestMethod.GET)
	 public String afficherTaitement(Model model) {
		 model.addAttribute("listeT", iTraitement.listTraitement());
		 return "afficherListTraitement";	 
	 }
	 //Add treatment
	 @RequestMapping (value = {"/ajouterTraitement"}, method = RequestMethod.GET)
      public String ajouterTraitement(Model model) {
		 model.addAttribute("traitement", new Traitement());
		 return "ajouterTraitement";  
      }
	 @RequestMapping (value = {"/ajouterTraitement"}, method = RequestMethod.POST)
	 public String ajouterTraitement1(Model model ,@ModelAttribute Traitement traitement) {
		 try {
			 iTraitement.creeTraitement(traitement);
			 return "redirect:/ajouterTraitement";
		 }catch (Exception ex) {
			  String messageErreur =ex.getMessage();
			  model.addAttribute("messageErreur", messageErreur);
			 return "ajouterTraitement";
		 }
	 }
	 //Delete treatment
	 @RequestMapping (value = {"/supprimierTraitement"}, method = RequestMethod.GET)
     public String suppriemerTraitement(Model model) {
		 model.addAttribute("traitement", iTraitement.listTraitement());
		 return "supprimierTraitement";  
     }
	 @RequestMapping (value = {"/supprimierTraitement"}, method = RequestMethod.POST)
	 public String suppriemerTraitement(Model model ,@RequestParam (name="id") int id) { //@ModelAttribute Traitement traitement
		 try {
			 iTraitement.supprimierTraitement(id);;
			 return "redirect:/afficherListTraitement";
		 }catch (Exception ex) {
			 String messageErreur =ex.getMessage();
			  model.addAttribute("messageErreur", messageErreur);
			 return "afficherListTraitement";
		 }
	 }
		
}
