package gestion_rendezvous.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private String cin;
    private Date dateNaissance;
    private String assurance;

    @OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVous;
}