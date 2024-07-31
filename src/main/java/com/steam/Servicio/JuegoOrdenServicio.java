package com.steam.Servicio;

import com.steam.Entidad.JuegoOrden;
import com.steam.Repositorio.JuegoOrdenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoOrdenServicio {
    @Autowired
    private JuegoOrdenRepositorio juegoOrdenRepositorio;

    public JuegoOrden saveOrder(JuegoOrden order) {
        try {
            return juegoOrdenRepositorio.save(order);
        } catch (Exception e) {
            throw new RuntimeException("Hubo un problema al realizar la compra: " + e.getMessage());
        }
    }
}

