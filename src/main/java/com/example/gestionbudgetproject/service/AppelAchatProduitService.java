package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.AppelAchatProduit;
import com.example.gestionbudgetproject.dao.AppelAchatProduitDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppelAchatProduitService {
    @Autowired
    private AppelAchatProduitDao appelAchatProduitDao;

    public AppelAchatProduit findByCode(String code) {
        return appelAchatProduitDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return appelAchatProduitDao.deleteByCode(code);
    }

    public int save(AppelAchatProduit appelAchatProduit) {
        if (findByCode(appelAchatProduit.getCode()) != null) {
            return -1;
        } else {
            appelAchatProduitDao.save(appelAchatProduit);
            return 1;
        }
    }
}
