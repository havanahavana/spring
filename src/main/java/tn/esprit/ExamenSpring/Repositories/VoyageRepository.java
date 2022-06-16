package tn.esprit.ExamenSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ExamenSpring.Entities.Voyage;

@Repository
public interface VoyageRepository extends JpaRepository<Voyage, Long> {
}
