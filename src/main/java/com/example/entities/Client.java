package com.example.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	@GeneratedValue
	private Long IdClient;
	private String nom;
	private String prenom;
	
    @OneToMany(mappedBy="client")
    private Set <Facture> factures;
	public Long getIdClient() {
		return IdClient;
	}
	public void setIdClient(Long idClient) {
		IdClient = idClient;
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
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
