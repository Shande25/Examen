package com.steam.Servicio;

import com.steam.Entidad.Usuario;
import com.steam.Repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario registerUser(Usuario usuario) {
        // Aquí podrías hacer validaciones antes de guardar si es necesario
        return usuarioRepositorio.save(usuario);
    }

    public Usuario findByEmail(String email) {
        return usuarioRepositorio.findByEmail(email);
    }
}
