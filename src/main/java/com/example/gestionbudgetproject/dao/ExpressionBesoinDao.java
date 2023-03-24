package com.example.gestionbudgetproject.dao;

import com.example.gestionbudgetproject.bean.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ExpressionBesoinDao extends JpaRepository<ExpressionBesoin, Long> {
    ExpressionBesoinDao findByRef(String ref);
    int deleteByRef(String ref);
    ExpressionBesoinDao findByDateExpressionBesoin(Date dateExpressionBesoin);

}
