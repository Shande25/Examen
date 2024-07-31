
package com.steam.Repositorio;

import com.steam.Entidad.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends MongoRepository<Usuario, String> {
    Usuario findByEmail(String email);
}
