package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.BudgetEntite;
import com.example.gestionbudgetproject.dao.BudgetEntiteDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BudgetEntiteService {
    private BudgetEntiteDao budgetEntiteDao ;

    public BudgetEntite findByCode(String code) {
        return budgetEntiteDao.findByRef(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return budgetEntiteDao.deleteByRef(code);
    }

    public List<BudgetEntite> findAll() {
        return budgetEntiteDao.findAll();
    }

    public int save(BudgetEntite budgetEntites) {
        if (findByCode(budgetEntites.getRef()) != null ){
            return -1 ;
        }
        else {
            budgetEntiteDao.save(budgetEntites);
            return 1 ;
        }
    }
}
