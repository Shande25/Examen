package com.steam.Controlador;

import com.steam.Entidad.Juego;
import com.steam.Servicio.JuegoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/juegos")
public class JuegoControlador {

    @Autowired
    private JuegoServicio productService;

    @GetMapping
    public @ResponseBody List<Juego> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public @ResponseBody Juego getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping("/crear")
    public @ResponseBody Juego createProduct(@RequestBody Juego product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/juego")
    public String juego() {
        return "juego";
    }
}
