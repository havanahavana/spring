package tn.esprit.ExamenSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ExamenSpring.Entities.Train;
import tn.esprit.ExamenSpring.Services.ITrainService;

import java.util.List;

@RestController
public class TrainController {
    @Autowired
    private ITrainService iTrainService;

    @PostMapping("/addTrain")
    public List<Train> ajoutTrain(@RequestBody Train train){
        return iTrainService.ajoutTrain(train);
    }
}
