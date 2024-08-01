package com.steam.Entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
public class JuegoOrden {
    @Id
    private String id;
    private List<Juego> products;
    private String status;

    // Getter y Setter para 'id'
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter y Setter para 'products'
    public List<Juego> getProducts() {
        return products;
    }

    public void setProducts(List<Juego> products) {
        this.products = products;
    }

    // Getter y Setter para 'status'
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
