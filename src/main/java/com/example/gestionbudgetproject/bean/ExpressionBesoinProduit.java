package com.example.gestionbudgetproject.bean;

import jakarta.persistence.*;

@Entity

public class ExpressionBesoinProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
    private Double quantite;
    private String code;
    private Double quantiteAccorde;
    private Double quantiteCommande;
    private Double quantiteLivre;
    private Double quantiteReception;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private ExpressionBesoin expressionBesoin ;

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getQuantiteAccorde() {
        return quantiteAccorde;
    }

    public void setQuantiteAccorde(Double quantiteAccorde) {
        this.quantiteAccorde = quantiteAccorde;
    }

    public Double getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(Double quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    public Double getQuantiteLivre() {
        return quantiteLivre;
    }

    public void setQuantiteLivre(Double quantiteLivre) {
        this.quantiteLivre = quantiteLivre;
    }

    public Double getQuantiteReception() {
        return quantiteReception;
    }

    public void setQuantiteReception(Double quantiteReception) {
        this.quantiteReception = quantiteReception;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public ExpressionBesoin getExpressionBesoin() {
        return expressionBesoin;
    }

    public void setExpressionBesoin(ExpressionBesoin expressionBesoin) {
        this.expressionBesoin = expressionBesoin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
