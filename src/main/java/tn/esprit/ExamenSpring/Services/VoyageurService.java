package tn.esprit.ExamenSpring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ExamenSpring.Entities.Voyage;
import tn.esprit.ExamenSpring.Entities.Voyageur;
import tn.esprit.ExamenSpring.Repositories.VoyageRepository;
import tn.esprit.ExamenSpring.Repositories.VoyageurRepository;

import java.util.List;

@Service
public class VoyageurService implements IVoyageurService{
    @Autowired
    private VoyageurRepository voyageurRepository;

    @Autowired
    private VoyageRepository voyageRepository;

    @Override
    public List<Voyageur> ajoutVoyageur(Voyageur voyageur) {
        voyageurRepository.save(voyageur);
        return voyageurRepository.findAll();
    }

    @Override
    public List<Voyage> ajoutVoyage(Voyage voyage) {
        voyageRepository.save(voyage);
        return voyageRepository.findAll();
    }
}
