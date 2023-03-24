package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.CategorieProduit;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CategorieProduitDao extends JpaRepository<CategorieProduit, Long> {
    CategorieProduit findByCode (long code);
    int deleteByCode (long code);


    }


