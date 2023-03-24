package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.CategorieProduit;
import com.example.gestionbudgetproject.dao.CategorieProduitDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieProduitService {
    @Autowired
    private CategorieProduitDao categorieProduitDao;
    public CategorieProduit findByCode(long code) {
        return categorieProduitDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(long code) {
        return categorieProduitDao.deleteByCode(code);
    }

    @Deprecated
    public CategorieProduit getOne(Long id) {
        return categorieProduitDao.getOne(id);
    }

    public List<CategorieProduit> findAll() {
        return categorieProduitDao.findAll();
    }

    public int save(CategorieProduit  categorieProduit) {
        if (findByCode(categorieProduit.getCode()) !=null){
            return -1;
        }else{
            categorieProduitDao.save(categorieProduit);
            return 1;}
    }
}
