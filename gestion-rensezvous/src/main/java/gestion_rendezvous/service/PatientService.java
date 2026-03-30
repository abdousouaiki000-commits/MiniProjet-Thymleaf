package gestion_rendezvous.service;


import gestion_rendezvous.entity.Patient;
import gestion_rendezvous.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient save(Patient p) {
        return patientRepository.save(p);
    }

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }
}