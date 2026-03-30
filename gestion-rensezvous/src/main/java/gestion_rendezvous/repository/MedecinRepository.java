package gestion_rendezvous.repository;


import gestion_rendezvous.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    // chercher par spécialité
    List<Medecin> findBySpecialite(String specialite);

    // chercher par nom
    List<Medecin> findByNom(String nom);
}

