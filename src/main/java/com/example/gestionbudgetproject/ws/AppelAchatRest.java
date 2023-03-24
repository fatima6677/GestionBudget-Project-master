package com.example.gestionbudgetproject.ws;

import com.example.gestionbudgetproject.bean.AppelAchat;
import com.example.gestionbudgetproject.service.AppelAchatService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@RestController
@RequestMapping("gestion-budget/appelAchat")
public class AppelAchatRest {
    @GetMapping("/code/{code}")
    public AppelAchat findByCode(@PathVariable String code) {
        return appelAchatService.findByCode(code);
    }

    @Transactional
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return appelAchatService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody AppelAchat appelAchat) {
        return appelAchatService.save(appelAchat);
    }
    @Autowired
    private AppelAchatService appelAchatService;

}
