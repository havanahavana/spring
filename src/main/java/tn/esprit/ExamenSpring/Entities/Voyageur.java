package tn.esprit.ExamenSpring.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVoyageur;
    private String nomVoyageur;

    @ManyToMany(mappedBy = "voyageurs")
    private List<Voyage> voyages;


}
