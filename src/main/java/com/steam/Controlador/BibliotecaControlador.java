package com.steam.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bibliotecaControlador {
    @GetMapping("/biblioteca")
    public String Biblioteca(){
        return "biblioteca.html";
    }
}
