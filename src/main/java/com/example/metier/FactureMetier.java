package com.example.metier;

import java.util.List;
import java.util.Optional;

import com.example.entities.Facture;

public interface FactureMetier {

	Optional<Facture> getFactureById(Long id);

	Facture saveFacture(Facture facture);

	Facture updateFacture(long id, Facture facture);

	void deleteFacture(long id);

	List<Facture> getAllFactures();

}
