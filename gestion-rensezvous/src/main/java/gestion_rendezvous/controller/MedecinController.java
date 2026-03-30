package gestion_rendezvous.controller;

import gestion_rendezvous.entity.Medecin;
import gestion_rendezvous.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medecins")
public class MedecinController {

    @Autowired
    private MedecinService service;

    @PostMapping
    public Medecin add(@RequestBody Medecin m) {
        return service.save(m);
    }

    @GetMapping
    public List<Medecin> all() {
        return service.getAll();
    }

    @GetMapping("/specialite/{sp}")
    public List<Medecin> bySpecialite(@PathVariable String sp) {
        return service.getBySpecialite(sp);
    }
}
