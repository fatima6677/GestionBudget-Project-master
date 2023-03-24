package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.CategorieEntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEntiteAdminDao extends JpaRepository<CategorieEntiteAdmin,Long> {
    CategorieEntiteAdmin findByCode(String code);
    int deleteByCode(String code);
}
