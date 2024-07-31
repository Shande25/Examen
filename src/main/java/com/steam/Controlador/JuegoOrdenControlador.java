package com.steam.Controlador;

import com.steam.Entidad.JuegoOrden;
import com.steam.Servicio.JuegoOrdenServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordenes")
public class JuegoOrdenControlador {

    @Autowired
    private JuegoOrdenServicio juegoOrdenServicio;

    @PostMapping("/crear")
    public ResponseEntity<JuegoOrden> createOrder(@RequestBody JuegoOrden order) {
        JuegoOrden savedOrder = juegoOrdenServicio.saveOrder(order);
        return ResponseEntity.ok(savedOrder);
    }
}
