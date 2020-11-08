package fr.lamia.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.Appoitment;

public interface AppoitmentRepository extends JpaRepository<Appoitment, Long> {

}
