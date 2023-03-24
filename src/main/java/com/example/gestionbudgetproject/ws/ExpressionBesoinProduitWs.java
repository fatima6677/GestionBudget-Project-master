package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.ExpressionBesoinProduit;
import com.example.gestionbudgetproject.service.ExpressionBesoinProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gestion-budget/expressionProduit")
public class ExpressionBesoinProduitWs {
    @Autowired
  private ExpressionBesoinProduitService expressionBesoinProduitService;
    @GetMapping ("/code/{code}")

    public ExpressionBesoinProduit findByCode(String code) {
        return expressionBesoinProduitService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(String code) {
        return expressionBesoinProduitService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(ExpressionBesoinProduit expressionProduit) {
        return expressionBesoinProduitService.save(expressionProduit);
    }
}
