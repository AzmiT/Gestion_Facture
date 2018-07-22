package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long>{

}
