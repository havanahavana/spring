package tn.esprit.ExamenSpring.Services;

import tn.esprit.ExamenSpring.Entities.Train;
import tn.esprit.ExamenSpring.Entities.Voyage;
import tn.esprit.ExamenSpring.Entities.Voyageur;

import java.util.List;

public interface ITrainService {
    List<Train> ajoutTrain(Train train);

    Voyage affecterTrainAVoyage(long idTrain, long idVoyageur);
}
