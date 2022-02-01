package es.dani.prueba.service;

import es.dani.prueba.model.Mensaje;
import java.util.List;

public interface IMensajeService {

    List<Mensaje> findAll();
}
