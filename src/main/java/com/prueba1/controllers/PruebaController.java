
package com.prueba1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.prueba1.entities.Prueba;
import com.prueba1.service.IPruebaService;

@Controller
public class PruebaController {
    private final IPruebaService pruebaService;
    
    public PruebaController(IPruebaService pruebaService){
        this.pruebaService= pruebaService;
    }
    
    @GetMapping("/product")
    public String index(Model model){
        model.addAttribute("prueba", new Prueba());
        model.addAttribute("pruebas", this.pruebaService.getAllPruebas());
        return "prueba";
    }
    @PostMapping("prueba/save")
    public String save(@ModelAttribute("prueba") Prueba prueba){
        this.pruebaService.save(prueba);
        return "redirect:/prueba";
    }
    
        
    @PostMapping("prueba/delete")
    public ResponseEntity<String> delete(@RequestBody Prueba prueba) {
        this.pruebaService.delete(prueba);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
