
package com.examen.controller;

import com.examen.entity.Conciertos;
import com.examen.service.ConciertosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ConciertosController {
    
     @Autowired
    private ConciertosService conciertosService;
     
     @GetMapping("/conciertos")
    public String index(Model model){
        List<Conciertos> listaConciertos = conciertosService.getAllConciertos();
        model.addAttribute("titulo", "Conciertos");
        model.addAttribute("conciertos", listaConciertos);
        return "Conciertos";
    }
    
    @GetMapping("/save")
    public String crearConciertos(Model model){
        model.addAttribute("conciertos", new Conciertos());
      
        return "Crear";
    }
    
    @PostMapping("/save")
    public String guardarConciertos(@ModelAttribute Conciertos conciertos){
       
        return "Redirect:/conciertos";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarConciertos(@PathVariable("id") Long idConciertos){
       
        return "Redirect:/conciertos";
    }
}
