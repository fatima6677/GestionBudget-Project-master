package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.EntiteAdmin;
import com.example.gestionbudgetproject.dao.EntiteAdminDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntiteAdminService {
    @Autowired
    private EntiteAdminDao entiteAdminDao;

    public EntiteAdmin findByCode(String code) {

        return entiteAdminDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {

        return entiteAdminDao.deleteByCode(code);
    }

    public int save(EntiteAdmin entiteAdmin) {
        if (findByCode(entiteAdmin.getCode()) != null) {
            return -1;
        } else {
            entiteAdminDao.save(entiteAdmin);
            return 1;
        }
    }

    public List<EntiteAdmin> findAll () {
        return entiteAdminDao.findAll();
    }

}
