package com.steam.Repositorio;

import com.steam.Entidad.JuegoOrden;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoOrdenRepositorio extends MongoRepository<JuegoOrden, String> {
}
