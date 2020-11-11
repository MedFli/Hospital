package fr.lamia.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
