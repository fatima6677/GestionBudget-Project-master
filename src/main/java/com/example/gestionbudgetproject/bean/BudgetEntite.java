package com.example.gestionbudgetproject.bean;

import jakarta.persistence.*;

@Entity
public class BudgetEntite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref ;
    @OneToOne
    private EntiteAdmin entiteAdmin ;
    @ManyToOne
    private Budget budget ;
    private double montantInvistissement ;
    private double montantFonctionnement ;
    private double montantTotal ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public double getMontantInvistissement() {
        return montantInvistissement;
    }

    public void setMontantInvistissement(double montantInvistissement) {
        this.montantInvistissement = montantInvistissement;
    }

    public double getMontantFonctionnement() {
        return montantFonctionnement;
    }

    public void setMontantFonctionnement(double montantFonctionnement) {
        this.montantFonctionnement = montantFonctionnement;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
