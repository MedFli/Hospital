package fr.lamia.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Labo {
	@Id @GeneratedValue
	private Long id;
	private String NameLabo;
	private String AdressLabo;
	private Long telLabo;
	private String commande;
	private String message;

	public String getNameLabo() {
		return NameLabo;
	}

	public Labo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Labo(Long id, String nameLabo, String adressLabo, Long telLabo, String commande, String message) {
		super();
		this.id = id;
		NameLabo = nameLabo;
		AdressLabo = adressLabo;
		this.telLabo = telLabo;
		this.commande = commande;
		this.message = message;
	}

	public void setNameLabo(String nameLabo) {
		NameLabo = nameLabo;
	}

	public String getAdressLabo() {
		return AdressLabo;
	}

	public void setAdressLabo(String adressLabo) {
		AdressLabo = adressLabo;
	}

	public Long getTelLabo() {
		return telLabo;
	}

	public void setTelLabo(Long telLabo) {
		this.telLabo = telLabo;
	}

	public String getCommande() {
		return commande;
	}

	public void setCommande(String commande) {
		this.commande = commande;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
