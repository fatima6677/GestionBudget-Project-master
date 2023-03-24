package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.AppelAchatProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppelAchatProduitDao extends JpaRepository<AppelAchatProduit,Long> {
    AppelAchatProduit findByCode(String code);
    int deleteByCode(String code);
}
