package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.BudgetEntite;
import com.example.gestionbudgetproject.service.BudgetEntiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-budget/budgetEntite")
public class BudgetEntiteWs {
    private BudgetEntiteService budgetEntiteService ;
    @GetMapping("code/{code}")
    public BudgetEntite findByRef(@PathVariable String code) {
        return budgetEntiteService.findByCode(code);
    }
    @DeleteMapping("code/{code}")
    public int deleteByRef(@PathVariable String code) {
        return budgetEntiteService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<BudgetEntite> findAll() {
        return budgetEntiteService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody BudgetEntite budgetEntites) {
        return budgetEntiteService.save(budgetEntites);
    }
}
