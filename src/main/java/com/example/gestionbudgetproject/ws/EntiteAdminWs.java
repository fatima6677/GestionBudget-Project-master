package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.EntiteAdmin;
import com.example.gestionbudgetproject.service.EntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-budget/entiteAdmin")
public class EntiteAdminWs {
    @Autowired
    private EntiteAdminService entiteAdminService;

    @GetMapping("/code/{code}")
    public EntiteAdmin findByCode(@PathVariable String code) {

        return entiteAdminService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {

        return entiteAdminService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<EntiteAdmin> findAll() {
        return entiteAdminService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody EntiteAdmin entiteAdmin) {
        return entiteAdminService.save(entiteAdmin);
    }
}

