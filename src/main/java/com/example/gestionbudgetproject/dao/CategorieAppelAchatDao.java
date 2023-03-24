package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.CategorieAppelAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieAppelAchatDao extends JpaRepository<CategorieAppelAchat,Long> {
    CategorieAppelAchat findByCode(String code);
    int deleteByCode(String code);
}
