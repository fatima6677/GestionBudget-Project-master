package com.example.gestionbudgetproject.service;


import com.example.gestionbudgetproject.bean.CategorieEntiteAdmin;
import com.example.gestionbudgetproject.dao.CategorieEntiteAdminDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieEntiteAdminService {
    @Autowired
    private CategorieEntiteAdminDao categorieEntiteAdminDao;

    public CategorieEntiteAdmin findByCode(String code) {
        return categorieEntiteAdminDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return categorieEntiteAdminDao.deleteByCode(code);
    }

    public List<CategorieEntiteAdmin> findAll() {
        return categorieEntiteAdminDao.findAll();
    }

    public int save(CategorieEntiteAdmin categorieEntiteAdmin) {
        if (findByCode(categorieEntiteAdmin.getCode()) != null) {
            return -1;
        } else {
            categorieEntiteAdminDao.save(categorieEntiteAdmin);
            return 1;
        }
    }
}
