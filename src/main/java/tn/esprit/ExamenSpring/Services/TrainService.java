package tn.esprit.ExamenSpring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ExamenSpring.Entities.Train;
import tn.esprit.ExamenSpring.Entities.Voyage;
import tn.esprit.ExamenSpring.Entities.Voyageur;
import tn.esprit.ExamenSpring.Repositories.TrainRepository;
import tn.esprit.ExamenSpring.Repositories.VoyageRepository;
import tn.esprit.ExamenSpring.Repositories.VoyageurRepository;

import java.util.List;

@Service
public class TrainService implements ITrainService{
    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    private VoyageurRepository voyageurRepository;

    @Autowired
    private VoyageRepository voyageRepository;
    @Override
    public List<Train> ajoutTrain(Train train) {
        trainRepository.save(train);
        return trainRepository.findAll();
    }

    @Override
    public Voyage affecterTrainAVoyage(long idTrain, long idVoyage) {
        Voyage voy=voyageRepository.findById(idVoyage).orElse(null);
        Train tr=trainRepository.findById(idTrain).orElse(null);
        voy.setTrain(tr);
        voyageRepository.save(voy);
        return voyageRepository.save(voy);
    }
}
