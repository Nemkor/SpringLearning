package es.dani.prueba.service;

import es.dani.prueba.model.Mensaje;
import es.dani.prueba.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository repository;

    public List<Mensaje> findAll() {
        return repository.findAll();
    }

    @Cacheable(value = "mensajes", key = "#id")
    public Mensaje findById(String id) {
        Optional<Mensaje> result = repository.findById(id);
        if(result.isEmpty()) return null;
        else return result.get();
    }

    @CacheEvict(value = "mensajes", key = "#nuevomensaje.id")
    public Mensaje save(Mensaje nuevomensaje) {

        return repository.save(nuevomensaje);
    }

    public void deletebyId(String id) {
        repository.deleteById(id);
    }
}
