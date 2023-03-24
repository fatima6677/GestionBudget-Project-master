package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.Budget;
import com.example.gestionbudgetproject.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-budget/budget")
public class BudgetWS {
    @Autowired
    private BudgetService budgetService ;
    @GetMapping("/code/{code}")
    public Budget findByCode(@PathVariable String code) {
        return budgetService.findByCode(code);
    }
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return budgetService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Budget> findAll() {
        return budgetService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Budget budget) {
        return budgetService.save(budget);
    }
}
