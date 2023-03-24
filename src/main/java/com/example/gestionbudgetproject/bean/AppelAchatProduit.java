package com.example.gestionbudgetproject.bean;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class AppelAchatProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String code ;
    @ManyToOne
    private Produit produit;
    private BigDecimal qteProduit;
    private BigDecimal qteRecep;
    private BigDecimal qteLivr;
    @ManyToOne
    private AppelAchat appelAchat ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public BigDecimal getQteProduit() {
        return qteProduit;
    }

    public void setQteProduit(BigDecimal qteProduit) {
        this.qteProduit = qteProduit;
    }

    public BigDecimal getQteRecep() {
        return qteRecep;
    }

    public void setQteRecep(BigDecimal qteRecep) {
        this.qteRecep = qteRecep;
    }

    public BigDecimal getQteLivr() {
        return qteLivr;
    }

    public void setQteLivr(BigDecimal qteLivr) {
        this.qteLivr = qteLivr;
    }

    public AppelAchat getAppelAchat() {
        return appelAchat;
    }

    public void setAppelAchat(AppelAchat appelAchat) {
        this.appelAchat = appelAchat;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
