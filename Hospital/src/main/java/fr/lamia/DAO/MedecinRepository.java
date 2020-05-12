package fr.lamia.DAO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.medecin;

public interface MedecinRepository extends JpaRepository<medecin, Long> {

	Page<medecin>findByNameContains(String keyw,Pageable pageable); 
}