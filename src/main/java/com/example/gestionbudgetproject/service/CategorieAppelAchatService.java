package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.CategorieAppelAchat;
import com.example.gestionbudgetproject.dao.CategorieAppelAchatDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieAppelAchatService {
    @Autowired
    private CategorieAppelAchatDao categorieAppelAchatDao;

    public CategorieAppelAchat findByCode(String code) {
        return categorieAppelAchatDao.findByCode(code);
    }
   @Transactional
    public int deleteByCode(String code) {
        return categorieAppelAchatDao.deleteByCode(code);
    }

    public int save(CategorieAppelAchat categorieAppelAchat) {
        if (findByCode(categorieAppelAchat.getCode()) != null) {
            return -1;
        } else {
            categorieAppelAchatDao.save(categorieAppelAchat);
            return 1;
        }
    }
}
