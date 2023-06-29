
package com.prueba1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.prueba1.service.IPruebaService;

@Controller
public class IndexController {
    private final IPruebaService pruebaService;
    
   public IndexController (IPruebaService pruebaService){
       this.pruebaService=pruebaService;
}
   @GetMapping("/")
   public String index (Model model){
       var pruebas = this.pruebaService.getAllPruebas();
       model.addAttribute("pruebas", pruebas);
       return "index";
   }
   

}