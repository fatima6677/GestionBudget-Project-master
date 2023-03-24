package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.CategorieAppelAchat;
import com.example.gestionbudgetproject.service.CategorieAppelAchatService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("gestion-budget/categorieAppelAchat")
public class CategorieAppelAchatRest {
    @Autowired
    private CategorieAppelAchatService categorieAppelAchatService;
    @GetMapping("/code/{code}")
    public CategorieAppelAchat findByIdCode(@PathVariable String code) {
        return categorieAppelAchatService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieAppelAchatService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody CategorieAppelAchat categorieAppelAchat) {
        return categorieAppelAchatService.save(categorieAppelAchat);
    }
}
