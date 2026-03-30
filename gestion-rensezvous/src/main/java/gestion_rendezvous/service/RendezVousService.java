package gestion_rendezvous.service;


import gestion_rendezvous.entity.RendezVous;
import gestion_rendezvous.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendezVousService {

    @Autowired
    private RendezVousRepository repo;

    public RendezVous save(RendezVous r) {
        r.setStatut("EN_ATTENTE");
        return repo.save(r);
    }

    public RendezVous valider(Long id) {
        RendezVous r = repo.findById(id).orElseThrow();
        r.setStatut("CONFIRME");
        return repo.save(r);
    }

    public RendezVous annuler(Long id) {
        RendezVous r = repo.findById(id).orElseThrow();
        r.setStatut("ANNULE");
        return repo.save(r);
    }

    public RendezVous absent(Long id) {
        RendezVous r = repo.findById(id).orElseThrow();
        r.setStatut("ABSENT");
        return repo.save(r);
    }

    public List<RendezVous> getAll() {
        return repo.findAll();
    }

    public List<Object[]> statsBySpecialite() {
        return repo.countBySpecialite();
    }

    public List<Object[]> statsByMonth() {
        return repo.countByMonth();
    }

    public Long noShow() {
        return repo.countNoShow();
    }
}