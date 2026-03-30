package gestion_rendezvous.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RendezVous {
    @Id
    @GeneratedValue
    private Long id;

    private Date dateHeure;
    private String statut;
    private String motif;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Medecin medecin;
}