package tn.esprit.ExamenSpring.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ExamenSpring.Entities.Voyageur;
import tn.esprit.ExamenSpring.Services.IVoyageurService;

import java.util.List;

@RestController
public class VoyageurController {
    @Autowired
    private IVoyageurService iVoyageurService;

    @PostMapping("ajoutVoyageur")
    public List<Voyageur> ajoutVoyageur(@RequestBody Voyageur voyageur){
        return iVoyageurService.ajoutVoyageur(voyageur);
    }
}
