package com.steam.Entidad;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document(collection = "orders")
public class JuegoOrden {
    @Id
    private String id;
    private List<Juego> products;
    private String status; // Por ejemplo, "pendiente", "completada"
}

