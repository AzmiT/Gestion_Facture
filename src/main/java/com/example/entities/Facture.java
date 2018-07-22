package com.example.entities;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture {
    
	@Id
	@GeneratedValue
	private Long IdFacture;
	@Temporal(TemporalType.DATE)
	private Date Date;
	private int numero_F;
	
	@ManyToOne
	@JoinColumn(name="fk_Client")
	private Client client;
	private Long totale;
	@Temporal(TemporalType.DATE)
	private Date paiment;
	
    @OneToMany(mappedBy="Facture")
	private List<Article> articles;
	public Long getIdFacture() {
		return IdFacture;
	}
	public void setIdFacture(Long idFacture) {
		IdFacture = idFacture;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public int getNumero_F() {
		return numero_F;
	}
	public void setNumero_F(int numero_F) {
		this.numero_F = numero_F;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Long getTotale() {
		return totale;
	}
	public void setTotale(Long totale) {
		this.totale = totale;
	}
	public Date getPaiment() {
		return paiment;
	}
	public void setPaiment(Date paiment) {
		this.paiment = paiment;
	}
	public Facture(java.util.Date date, int numero_F, Client client, Long totale, java.util.Date paiment) {
		super();
		Date = date;
		this.numero_F = numero_F;
		this.client = client;
		this.totale = totale;
		this.paiment = paiment;
	}
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

