package es.dani.prueba.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "Mensajes")
public class Mensaje {

    @Id
    @GeneratedValue
    private String id;w
    private String contenido;

    public Mensaje() {
    }

    public Mensaje(String id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }


    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getContenido() {

        return contenido;
    }

    public void setContenido(String contenido) {

        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return String.format("Mensaje[id=%s, contenido='%s']", id, contenido);
    }

}