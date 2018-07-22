package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Facture;
import com.example.metier.FactureMetier;

@RestController
@CrossOrigin("*")
public class FactureServices {
	
	
	@Autowired
private FactureMetier factureMetier;

	@RequestMapping(value="/Facture",method=RequestMethod.GET)
	public List<Facture> getAllFactures() {
		return factureMetier.getAllFactures();
	} 
	
	@RequestMapping(value="/Facture/{id}",method=RequestMethod.GET)
	public Optional<Facture> getFactureById(@PathVariable long id) {
		return factureMetier.getFactureById(id);
	}
	
	@RequestMapping(value="/Facture",method=RequestMethod.POST)
	public Facture saveFacture(@RequestBody Facture Facture) {
		return factureMetier.saveFacture(Facture);
	}

	@RequestMapping(value="/Facture/{id}",method=RequestMethod.PUT)
	public Facture updateFacture(@PathVariable Long id, @RequestBody Facture Facture) {
		
		return factureMetier.updateFacture(id, Facture);
	}

	
	@RequestMapping(value="/Facture/{id}",method=RequestMethod.DELETE)
	public void deleteFacture(@PathVariable long id) {
		factureMetier.deleteFacture(id);
	}

}
