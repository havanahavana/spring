package tn.esprit.ExamenSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ExamenSpring.Entities.Voyage;
import tn.esprit.ExamenSpring.Services.ITrainService;

@RestController
public class VoyageController {

    @Autowired
    private ITrainService iTrainService;


    @GetMapping("AffectTrainToVoyage/{idTrain}/{idVoyage}")
    public Voyage AffectTrainToVoyage(@PathVariable long idTrain,@PathVariable long idVoyage){
        return iTrainService.affecterTrainAVoyage(idTrain,idVoyage);
    }
}
