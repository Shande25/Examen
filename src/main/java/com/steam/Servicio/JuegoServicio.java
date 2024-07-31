package com.steam.Servicio;

import com.steam.Entidad.Juego;
import com.steam.Repositorio.JuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegoServicio {

    @Autowired
    private JuegoRepositorio juegoRepositorio;

    public Juego saveProduct(Juego juego) {
        return juegoRepositorio.save(juego);
    }

    public List<Juego> getAllProducts() {
        return juegoRepositorio.findAll();
    }

    public Juego getProductById(String id) {
        return juegoRepositorio.findById(id).orElse(null);
    }

    public void deleteProduct(String id) {
        juegoRepositorio.deleteById(id);
    }
}
