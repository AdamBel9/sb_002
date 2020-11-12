package dz.ibnrochd.master14.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(schema = "cabinet", name = "ligne_consultation")
public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;

    //field
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id ;
	
	@Column (name = "posologie" , nullable = false , length= 255)
	private String posologie ;
	
	@Column (name="unite_temps",nullable=false ,length=255)
	private String uniteTemps ;
	
	@Column (name = "quantite" , nullable = false , length = 255)
	private String quantite ; 
	
	@ManyToOne
	@JoinColumn(name="id_consultation" ,nullable= false)
	private Consultation consultation ;

	@ManyToOne
	@JoinColumn(name="id_traitement" ,nullable= false)
	private Traitement traitement ;


	
	//Constructor
	
	public LigneConsultation(int id, String posologie, String uniteTemps, String quantite, Consultation consultation,
			Traitement traitement) {
		super();
		this.id = id;
		this.posologie = posologie;
		this.uniteTemps = uniteTemps;
		this.quantite = quantite;
		this.consultation = consultation;
		this.traitement = traitement;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPosologie() {
		return posologie;
	}



	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}



	public String getUniteTemps() {
		return uniteTemps;
	}



	public void setUniteTemps(String uniteTemps) {
		this.uniteTemps = uniteTemps;
	}



	public String getQuantite() {
		return quantite;
	}



	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	
	
}
