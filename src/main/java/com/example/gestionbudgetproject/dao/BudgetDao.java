package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetDao extends JpaRepository<Budget , Long> {
    Budget findByCode(String code);
    int deleteByCode(String code);
}
