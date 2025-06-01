package org.example.sabrimerroun.repository;

import org.example.sabrimerroun.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {

    @Query("SELECT e FROM Evenement e ORDER BY e.tijdstip DESC LIMIT 10")
    List<Evenement> findTop10ByOrderByTijdstipDesc();
}
