package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.datetime.DateFormatter;

import ch.qos.logback.classic.pattern.DateConverter;

@Entity
@Table(schema = "cabinet", name = "patient")
public class Patient implements Serializable {

	private static final long serialVersionUID = -3415388341943341473L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 255)
    private String prenom;

    @Column(name = "sexe", nullable = false, length = 1)
    private String sexe;

    @Column(name = "date_naissance", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    
    

    @Column(name = "numero_telephone", nullable = false, length = 255)
    private String numeroTelephone;

    @Column(name = "adresse", nullable = false, length = 255)
    private String adresse;
    
    @OneToMany(mappedBy = "patient")
    private List<Consultation> consultations = new ArrayList<>();
    
    @OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVous = new ArrayList<>();
    
    /////////////////////////////////////////////////////////
    
  
    public Patient() {}
	public Patient( int id ,String nom, String prenom, String sexe, String dateNaissance, String numeroTelephone,
			String adresse) throws ParseException {
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		this.id=id ;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = format1.parse(dateNaissance);
		this.numeroTelephone = numeroTelephone;
		this.adresse = adresse;
	}
	
	//////////////////////////////////////////////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String date ) throws ParseException {
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		this.dateNaissance = format1.parse(date);
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nom: "+ nom + "\n"+
		"Prenom: "+ prenom + "\n"
		;
	}

}
