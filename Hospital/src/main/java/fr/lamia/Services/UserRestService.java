package fr.lamia.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.lamia.DAO.RoleRepository;
import fr.lamia.DAO.UserRepository;
import fr.lamia.Entities.Role;
import fr.lamia.Entities.User;
@RestController
public class UserRestService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@RequestMapping(value = "/addUser")
	public User save(User u) {
		return userRepository.save(u);
		
	}
	@RequestMapping(value = "/findUsers")
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/addRole")
	public Role addRole(Role r) {
		return roleRepository.save(r);
	}

}
