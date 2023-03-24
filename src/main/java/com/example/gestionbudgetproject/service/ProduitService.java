package com.example.gestionbudgetproject.service;


import com.example.gestionbudgetproject.bean.Produit;
import com.example.gestionbudgetproject.dao.ProduitDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;
    public Produit findByCode(Long code) {
        return produitDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(Long code) {
        return produitDao.deleteByCode(code);
    }

    @Deprecated
    public Produit getOne(Long id) {
        return produitDao.getOne(id);
    }

    public List<Produit> findAll() {
        return produitDao.findAll();
    }


    public int save(Produit produit) {
        if (findByCode(produit.getCode()) != null) {
            return -1;
        } else {
            produitDao.save(produit);
            return 1;
        }

    }
}



