package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.*;
import com.example.gestionbudgetproject.dao.AppelAchatDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AppelAchatService {
    @Autowired
    private AppelAchatDao appelAchatDao;
    @Autowired
    private AppelAchatProduitService appelAchatProduitService;
    @Autowired
    private ProduitService produitService;

    public AppelAchat findByCode(String code) {
        return appelAchatDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {

        return appelAchatDao.deleteByCode(code);
    }


    public int save(AppelAchat appelAchat) {
        List<AppelAchatProduit> appelAchatProduits = appelAchat.getAppelAchatProduits();

        if (appelAchat.getCode() == null) {
            return -1;
        } else if (appelAchat.getAppelAchatProduits() == null || appelAchat.getAppelAchatProduits().isEmpty()) {
            return -2;
        } else {
            appelAchatDao.save(appelAchat);
            for (AppelAchatProduit appelAchatProduit : appelAchatProduits) {
                appelAchatProduit.setAppelAchat(appelAchat);
                appelAchatProduitService.save(appelAchatProduit);
            }
            return 1;
        }

    }
}
