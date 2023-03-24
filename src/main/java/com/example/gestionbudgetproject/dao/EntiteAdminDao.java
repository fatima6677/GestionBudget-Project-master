package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.EntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntiteAdminDao extends JpaRepository<EntiteAdmin,Long> {
    EntiteAdmin findByCode(String code);
    int deleteByCode(String code);

}
