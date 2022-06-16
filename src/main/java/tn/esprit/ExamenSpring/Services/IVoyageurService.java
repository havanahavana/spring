package tn.esprit.ExamenSpring.Services;

import tn.esprit.ExamenSpring.Entities.Voyage;
import tn.esprit.ExamenSpring.Entities.Voyageur;

import java.util.List;

public interface IVoyageurService {

    List<Voyageur> ajoutVoyageur(Voyageur voyageur);

    List<Voyage> ajoutVoyage(Voyage voyage);

}
