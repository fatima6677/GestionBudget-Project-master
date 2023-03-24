package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.Produit;
import com.example.gestionbudgetproject.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-budget/produit")
public class ProduitProvided {
    @Autowired
    private ProduitService produitService;
    @GetMapping("/code/{code}")
    public Produit findByCode(@PathVariable Long code) {
        return produitService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable Long code) {
        return produitService.deleteByCode(code);
    }
    @GetMapping("/id/{id}")
    public Produit getOne(@PathVariable Long id) {
        return produitService.getOne(id);
    }
    @GetMapping("/")
    public List<Produit> findAll() {
        return produitService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }
}
