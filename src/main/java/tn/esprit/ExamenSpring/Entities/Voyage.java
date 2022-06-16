package tn.esprit.ExamenSpring.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long idVoyage;

    private long codeVoyage;

    @Enumerated(EnumType.STRING)
    private Ville gareDepart;

    @Enumerated(EnumType.STRING)
    private Ville gareArrivee;

    private double heureDepart;

    private double heureArrivee;

    @Temporal(TemporalType.DATE)
    private Date dateDepart;

    @Temporal(TemporalType.DATE)
    private Date dateArrive;

    @ManyToOne(cascade = CascadeType.ALL)
    private Train train;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Voyageur> voyageurs;
}
