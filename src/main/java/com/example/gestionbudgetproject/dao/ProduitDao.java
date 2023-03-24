package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
    Produit findByCode(Long code);
    int deleteByCode(Long code);
}
