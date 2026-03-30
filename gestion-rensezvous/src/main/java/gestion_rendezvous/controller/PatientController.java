package gestion_rendezvous.controller;


import gestion_rendezvous.entity.Patient;
import gestion_rendezvous.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    public Patient add(@RequestBody Patient p) {
        return service.save(p);
    }

    @GetMapping
    public List<Patient> all() {
        return service.getAll();
    }
}