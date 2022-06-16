package tn.esprit.ExamenSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ExamenSpring.Entities.Voyage;
import tn.esprit.ExamenSpring.Entities.Voyageur;
import tn.esprit.ExamenSpring.Services.ITrainService;
import tn.esprit.ExamenSpring.Services.IVoyageurService;

import java.util.List;

@RestController
public class VoyageController {

    @Autowired
    private ITrainService iTrainService;

    @Autowired
    private IVoyageurService iVoyageurService;

    @GetMapping("AffectTrainToVoyage/{idTrain}/{idVoyage}")
    public Voyage AffectTrainToVoyage(@PathVariable long idTrain,@PathVariable long idVoyage){
        return iTrainService.affecterTrainAVoyage(idTrain,idVoyage);
    }

    @PostMapping("addVoyage")
    public List<Voyage>addVoyage(@RequestBody Voyage voyage){
        return iVoyageurService.ajoutVoyage(voyage);
    }
}
