package com.steam.Repositorio;

import com.steam.Entidad.Juego;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoRepositorio extends MongoRepository<Juego, String> {
}
