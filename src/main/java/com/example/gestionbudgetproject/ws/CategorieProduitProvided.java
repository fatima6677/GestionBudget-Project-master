package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.CategorieProduit;
import com.example.gestionbudgetproject.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-budget/categorieProduit")
public class CategorieProduitProvided {
    @Autowired
    private CategorieProduitService categorieProduitService;
    @GetMapping("/code/{code}")
    public CategorieProduit findByCode(@PathVariable long code) {
        return categorieProduitService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable long code) {
        return categorieProduitService.deleteByCode(code);
    }

    @GetMapping("/id/{id}")
    public CategorieProduit getOne(@PathVariable Long id) {
        return categorieProduitService.getOne(id);
    }
    @GetMapping("/")
    public List<CategorieProduit> findAll() {
        return categorieProduitService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody CategorieProduit categorieProduit) {
        return categorieProduitService.save(categorieProduit);
    }
}
