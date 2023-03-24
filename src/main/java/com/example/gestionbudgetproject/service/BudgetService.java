package com.example.gestionbudgetproject.service;

import com.example.gestionbudgetproject.bean.Budget;
import com.example.gestionbudgetproject.bean.BudgetEntite;
import com.example.gestionbudgetproject.bean.EntiteAdmin;
import com.example.gestionbudgetproject.dao.BudgetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetDao budgetDao;
    @Autowired
    private BudgetEntiteService budgetEntiteService;
    @Autowired
    private EntiteAdminService entiteAdminService;

    public Budget findByCode(String code) {
        return budgetDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return budgetDao.deleteByCode(code);
    }

    public List<Budget> findAll() {
        return budgetDao.findAll();
    }

    public int save(Budget budget) {
        List<BudgetEntite> budgetEntites = budget.getBudgetEntites();
        for (BudgetEntite budgetEntite : budgetEntites) {
            EntiteAdmin loadedEntiteAdmin = entiteAdminService.findByCode(budgetEntite.getEntiteAdmin().getCode());
            budgetEntite.setEntiteAdmin(loadedEntiteAdmin);
        }
        if (budget.getCode() == null) {
            return -1;
        } else if (budget.getBudgetEntites() == null || budget.getBudgetEntites().isEmpty()) {
            return -2;
        }

        budgetDao.save(budget);
        for (BudgetEntite budgetEntite : budgetEntites) {
            budgetEntite.setBudget(budget);
            budgetEntiteService.save(budgetEntite);
        }
        return 1;
    }
}
