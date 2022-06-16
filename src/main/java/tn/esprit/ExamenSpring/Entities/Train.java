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
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long codeTrain;

    @Enumerated(EnumType.STRING)
    private etatTrain etat;

    private  int nbPlaceLibre;

 

}
