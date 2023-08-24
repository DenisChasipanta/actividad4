package com.chasipanta1.Actividad4.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.lang.model.element.NestingKind;

@Controller
public class PaginaController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/productos")
    public String productos(){
        return "productos";
    }
    @GetMapping("/juegos")
    public String juegos(){
        return "juegos";
    }
    @GetMapping("/registro")
    public String registro(){
        return "registro";
    }

}
