package tn.esprit.ExamenSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ExamenSpring.Entities.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
}
