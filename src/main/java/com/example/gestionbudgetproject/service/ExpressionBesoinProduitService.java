package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.ExpressionBesoinProduit;
import com.example.gestionbudgetproject.dao.ExpressionBesoinProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpressionBesoinProduitService {
    @Autowired
    private ExpressionBesoinProduitDao expressionBesoinProduitDao;

    public ExpressionBesoinProduit findByCode(String code) {
        return expressionBesoinProduitDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return expressionBesoinProduitDao.deleteByCode(code);
    }
    public int save (ExpressionBesoinProduit expressionProduit){
        if (findByCode(expressionProduit.getCode()) != null){
            return -1;
        }else{
            expressionBesoinProduitDao.save(expressionProduit);
            return 1;
        }
    }
}
