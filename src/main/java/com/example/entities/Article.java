package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article {
	
	@Id
	@GeneratedValue
	private Long IdArticle;
	private Long Qte;
	private Double PU;
	private Double tva;
	private String description;
	private Double Totale;
	@ManyToOne
	@JoinColumn(name="fk_Facture")
	private Facture Facture;
	public Long getIdArticle() {
		return IdArticle;
	}
	public void setIdArticle(Long idArticle) {
		IdArticle = idArticle;
	}
	
	public Long getQte() {
		return Qte;
	}
	public void setQte(Long qte) {
		Qte = qte;
	}
	public Double getPU() {
		return PU;
	}
	public void setPU(Double pU) {
		PU = pU;
	}
	public Double getTva() {
		return tva;
	}
	public void setTva(Double tva) {
		this.tva = tva;
	}
	public Double getTotale() {
		return Totale;
	}
	public void setTotale(Double totale) {
		Totale = totale;
	}
	public Facture getFacture() {
		return Facture;
	}
	public void setFacture(Facture facture) {
		Facture = facture;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
