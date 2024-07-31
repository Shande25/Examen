package com.steam.Controlador;

import com.steam.Entidad.Usuario;
import com.steam.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(Usuario usuario, Model model) {
        usuarioServicio.registerUser(usuario);
        model.addAttribute("message", "Registro exitoso");
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(Usuario usuario, Model model) {
        Usuario foundUser = usuarioServicio.findByEmail(usuario.getEmail());
        if (foundUser != null && usuario.getPassword().equals(foundUser.getPassword())) {
            model.addAttribute("message", "Inicio de sesión exitoso");
            return "home"; // Página de inicio después de login exitoso
        } else {
            model.addAttribute("message", "Credenciales incorrectas");
            return "login";
        }
    }

    @GetMapping("/iniciosesion")
    public String inicioSesion() {
        return "login"; // Nombre de la vista HTML
    }
}
