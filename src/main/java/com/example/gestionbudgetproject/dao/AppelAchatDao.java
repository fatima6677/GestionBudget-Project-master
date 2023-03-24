package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.AppelAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AppelAchatDao extends JpaRepository< AppelAchat,Long> {
    AppelAchat findByCode(String code );

    int deleteByCode(String code);



}
