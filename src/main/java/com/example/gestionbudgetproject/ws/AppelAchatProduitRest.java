package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.AppelAchatProduit;
import com.example.gestionbudgetproject.service.AppelAchatProduitService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("gestion-budget/appelAchatProduit")
public class AppelAchatProduitRest {
    @Autowired
    private AppelAchatProduitService appelAchatProduitService;
    @GetMapping("/code/{code}")
    public AppelAchatProduit findByCode(@PathVariable String code) {
        return appelAchatProduitService.findByCode(code);
    }


    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return appelAchatProduitService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody AppelAchatProduit appelAchatProduit) {
        return appelAchatProduitService.save(appelAchatProduit);
    }
}
