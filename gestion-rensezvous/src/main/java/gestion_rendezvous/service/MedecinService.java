package gestion_rendezvous.service;


import gestion_rendezvous.entity.Medecin;
import gestion_rendezvous.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinService {

    @Autowired
    private MedecinRepository repo;

    public Medecin save(Medecin m) {
        return repo.save(m);
    }

    public List<Medecin> getAll() {
        return repo.findAll();
    }

    public List<Medecin> getBySpecialite(String specialite) {
        return repo.findBySpecialite(specialite);
    }
}
