package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.BudgetEntite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetEntiteDao extends JpaRepository<BudgetEntite , Long> {
    BudgetEntite findByRef(String ref);
    int deleteByRef(String ref);
}
