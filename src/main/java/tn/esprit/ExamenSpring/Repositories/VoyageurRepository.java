package tn.esprit.ExamenSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import tn.esprit.ExamenSpring.Entities.Voyageur;

@Repository
public interface VoyageurRepository extends JpaRepository<Voyageur, Long> {
}
