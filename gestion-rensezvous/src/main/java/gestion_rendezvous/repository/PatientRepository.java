package gestion_rendezvous.repository;

import gestion_rendezvous.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // chercher par nom
    List<Patient> findByNom(String nom);

    // chercher par CIN
    Patient findByCin(String cin);
}

