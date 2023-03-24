package com.example.gestionbudgetproject.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String code ;
    private double montantInvestissement ;
    private double montantFoncionnement ;
    private double montantTotal ;
    private int annee ;
    @OneToMany
    private List<BudgetEntite> budgetEntites ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMontantInvestissement() {
        return montantInvestissement;
    }

    public void setMontantInvestissement(double montantInvestissement) {
        this.montantInvestissement = montantInvestissement;
    }

    public double getMontantFoncionnement() {
        return montantFoncionnement;
    }

    public void setMontantFoncionnement(double montantFoncionnement) {
        this.montantFoncionnement = montantFoncionnement;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public List<BudgetEntite> getBudgetEntites() {
        return budgetEntites;
    }

    public void setBudgetEntites(List<BudgetEntite> budgetEntites) {
        this.budgetEntites = budgetEntites;
    }
}
