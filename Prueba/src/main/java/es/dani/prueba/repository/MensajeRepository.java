package es.dani.prueba.repository;

import es.dani.prueba.model.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends MongoRepository<Mensaje, String> {
}