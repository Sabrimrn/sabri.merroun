package org.example.sabrimerroun.repository;

import org.example.sabrimerroun.model.Locatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocatieRepository extends JpaRepository<Locatie, Long> {
}
