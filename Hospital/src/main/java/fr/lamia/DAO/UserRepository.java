package fr.lamia.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
