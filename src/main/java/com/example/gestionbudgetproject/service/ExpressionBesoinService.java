package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.*;
import com.example.gestionbudgetproject.dao.ExpressionBesoinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExpressionBesoinService {
    @Autowired
    private ExpressionBesoinDao expressionBesoinDao;
    @Autowired
    private ExpressionBesoinProduitService expressionBesoinProduitService ;
    @Autowired
    private ProduitService produitService ;

    public ExpressionBesoinDao findByRef(String ref) {
        return expressionBesoinDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return expressionBesoinDao.deleteByRef(ref);
    }

    public ExpressionBesoinDao findByDateExpressionBesoin(Date dateExpressionBesoin) {
        return expressionBesoinDao.findByDateExpressionBesoin(dateExpressionBesoin);
    }

    public int save(ExpressionBesoin expressionBesoin) {
        List<ExpressionBesoinProduit> expressionBesoinProduits = expressionBesoin.getExpressionBesoinProduits() ;
        for ( ExpressionBesoinProduit expressionBesoinProduit : expressionBesoinProduits ){
           Produit loadedProduit =  produitService.findByCode(expressionBesoinProduit.getProduit().getCode());
            expressionBesoinProduit.setProduit(loadedProduit);
        }
        if (expressionBesoin.getRef() == null) {
            return  -1;
        }else if (expressionBesoin.getExpressionBesoinProduits() == null || expressionBesoin.getExpressionBesoinProduits().isEmpty()) {
            return  -2;
        }

        expressionBesoinDao.save(expressionBesoin);
        for ( ExpressionBesoinProduit expressionBesoinProduit : expressionBesoinProduits ){
            expressionBesoinProduit.setExpressionBesoin(expressionBesoin);
            expressionBesoinProduitService.save(expressionBesoinProduit) ;
        }
        return  1;
    }
}
