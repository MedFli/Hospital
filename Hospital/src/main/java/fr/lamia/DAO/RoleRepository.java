package fr.lamia.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.lamia.Entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {


}
