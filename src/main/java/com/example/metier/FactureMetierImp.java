package com.example.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ArticleRepository;
import com.example.dao.FactureRepository;
import com.example.entities.Article;
import com.example.entities.Facture;
	@Service
	public class FactureMetierImp implements FactureMetier
	{
		@Autowired
	    private FactureRepository factureRepository;

		
		@Override
		public Optional<Facture> getFactureById(Long id) {
			  
			return factureRepository.findById(id);
		}

		@Override
		public Facture saveFacture(Facture facture) {
			
	        return factureRepository.save(facture);
		}

		@Override
		public Facture updateFacture(long id , Facture facture) {
			
			facture.setIdFacture(id);
	        return factureRepository.save(facture);       
		}

		@Override
		public void deleteFacture(long id) {
			
	        factureRepository.deleteById(id);
		}

		@Override
		public List<Facture> getAllFactures() {
			
		       return factureRepository.findAll();	}
	   

}
