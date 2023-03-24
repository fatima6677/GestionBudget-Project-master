package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.ExpressionBesoin;
import com.example.gestionbudgetproject.dao.ExpressionBesoinDao;
import com.example.gestionbudgetproject.service.ExpressionBesoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("gestion-budget/expressionBesoin")
public class ExpressionBesoinWs {
   @Autowired
    private ExpressionBesoinService expressionBesoinService;
    @GetMapping("/ref/{ref}")
    public ExpressionBesoinDao findByRef(String ref) {
        return expressionBesoinService.findByRef(ref);
    }
    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(String ref) {
        return expressionBesoinService.deleteByRef(ref);
    }
    @GetMapping("/dateExpressionBesoin/{dateExpressionBesoin}")
    public ExpressionBesoinDao findByDateExpressionBesoin(Date dateExpressionBesoin) {
        return expressionBesoinService.findByDateExpressionBesoin(dateExpressionBesoin);
    }
    @PostMapping("/")
    public int save(ExpressionBesoin expressionBesoin) {
        return expressionBesoinService.save(expressionBesoin);
    }
}
