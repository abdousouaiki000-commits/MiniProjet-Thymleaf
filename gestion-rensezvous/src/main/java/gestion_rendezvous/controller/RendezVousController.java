package gestion_rendezvous.controller;

import gestion_rendezvous.entity.RendezVous;
import gestion_rendezvous.service.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rendezvous")
public class RendezVousController {

    @Autowired
    private RendezVousService service;

    @PostMapping
    public RendezVous create(@RequestBody RendezVous r) {
        return service.save(r);
    }

    @GetMapping
    public List<RendezVous> all() {
        return service.getAll();
    }

    @PutMapping("/valider/{id}")
    public RendezVous valider(@PathVariable Long id) {
        return service.valider(id);
    }

    @PutMapping("/annuler/{id}")
    public RendezVous annuler(@PathVariable Long id) {
        return service.annuler(id);
    }

    @PutMapping("/absent/{id}")
    public RendezVous absent(@PathVariable Long id) {
        return service.absent(id);
    }

    @GetMapping("/stats/specialite")
    public List<Object[]> specialite() {
        return service.statsBySpecialite();
    }

    @GetMapping("/stats/mois")
    public List<Object[]> mois() {
        return service.statsByMonth();
    }

    @GetMapping("/stats/noshow")
    public Long noshow() {
        return service.noShow();
    }
}
