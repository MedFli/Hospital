package fr.lamia.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.Labo;

public interface LaboRepository extends JpaRepository<Labo, Long> {

}
