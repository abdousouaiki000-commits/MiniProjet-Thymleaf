package gestion_rendezvous.repository;


import gestion_rendezvous.entity.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;


public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    List<RendezVous> findByStatut(String statut);
    List<RendezVous> findByMedecinId(Long id);
    List<RendezVous> findByDateHeure(Date date);


    // Nombre de rendez-vous par spécialité
    @Query("SELECT r.medecin.specialite, COUNT(r) FROM RendezVous r GROUP BY r.medecin.specialite")
    List<Object[]> countBySpecialite();

    // Nombre de rendez-vous par mois
    @Query("SELECT MONTH(r.dateHeure), COUNT(r) FROM RendezVous r GROUP BY MONTH(r.dateHeure)")
    List<Object[]> countByMonth();

    // No-show
    @Query("SELECT COUNT(r) FROM RendezVous r WHERE r.statut = 'ABSENT'")
    Long countNoShow();
}
