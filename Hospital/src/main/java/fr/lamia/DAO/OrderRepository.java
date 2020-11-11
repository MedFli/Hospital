package fr.lamia.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
