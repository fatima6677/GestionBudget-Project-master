package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.CategorieEntiteAdmin;
import com.example.gestionbudgetproject.service.CategorieEntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-budget/categorieEntiteAdmin")
public class CategorieEntiteAdminWs {
    @Autowired
    private CategorieEntiteAdminService categorieEntiteAdminService;

    @GetMapping("/code/{code}")
    public CategorieEntiteAdmin findByCode(@PathVariable String code) {
        return categorieEntiteAdminService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieEntiteAdminService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<CategorieEntiteAdmin> findAll() {
        return categorieEntiteAdminService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody CategorieEntiteAdmin categorieEntiteAdmin) {
        return categorieEntiteAdminService.save(categorieEntiteAdmin);
    }
}

