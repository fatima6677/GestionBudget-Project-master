package com.example.gestionbudgetproject.bean;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class AppelAchat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String code ;
    private Date dateAppelAchat;
    private float total;
    @OneToMany
    private List<AppelAchatProduit> appelAchatProduits ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getDateAppelAchat() {
        return dateAppelAchat;
    }

    public void setDateAppelAchat(Date dateAppelAchat) {
        this.dateAppelAchat = dateAppelAchat;
    }

    public List<AppelAchatProduit> getAppelAchatProduits() {
        return appelAchatProduits;
    }

    public void setAppelAchatProduits(List<AppelAchatProduit> appelAchatProduits) {
        this.appelAchatProduits = appelAchatProduits;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
