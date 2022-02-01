package es.dani.prueba.controller;

import es.dani.prueba.model.Mensaje;
import es.dani.prueba.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/mensaje")
public class MensajeController {

    @Autowired
    private MensajeService service;

    @GetMapping
    public List<Mensaje> selectAll() {
        List<Mensaje> listamsj = service.findAll();
        return listamsj;
    }

    @GetMapping("/{id}")
    public Mensaje getMensajeFromId(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mensaje insertMensaje(@RequestBody Mensaje mensaje) {
        return service.save(mensaje);
    }

    @PutMapping
    public String putMensaje() {
        return "MENSAJE ACTUALIZADO";
    }

    @DeleteMapping
    public String deleteMensaje(@PathVariable String id) {
        service.deletebyId(id);
        return "MENSAJE BORRADO";
    }
}
