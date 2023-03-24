package com.example.gestionbudgetproject.bean;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class ExpressionBesoin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double total;
    private Date dateExpressionBesoin;
    private String ref;
    @ManyToOne
    private BudgetEntite budgetEntite;
    @OneToMany
    private List<ExpressionBesoinProduit> expressionBesoinProduits ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getDateExpressionBesoin() {
        return dateExpressionBesoin;
    }

    public void setDateExpressionBesoin(Date dateExpressionBesoin) {
        this.dateExpressionBesoin = dateExpressionBesoin;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public BudgetEntite getBudgetEntite() {
        return budgetEntite;
    }

    public void setBudgetEntite(BudgetEntite budgetEntites) {
        this.budgetEntite = budgetEntites;
    }




    public List<ExpressionBesoinProduit> getExpressionBesoinProduits() {
        return expressionBesoinProduits;
    }

    public void setExpressionBesoinProduits(List<ExpressionBesoinProduit> expressionBesoinProduits) {
        this.expressionBesoinProduits = expressionBesoinProduits;
    }

}
