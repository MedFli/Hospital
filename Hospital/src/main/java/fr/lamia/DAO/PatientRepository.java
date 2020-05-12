package fr.lamia.DAO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	Page<Patient>findByNameContains(String keyw,Pageable pageable); 
}
