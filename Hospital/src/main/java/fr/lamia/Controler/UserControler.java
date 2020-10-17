package fr.lamia.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.lamia.DAO.UserRepository;
import fr.lamia.Entities.Patient;
import fr.lamia.Entities.User;

@Controller
public class UserControler {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/logout")
	public String logout() {
		return "redirect:/login";
	}

	@RequestMapping(value = "Authentification", method = RequestMethod.GET)
	public String Authentification(Model model) {
		model.addAttribute("user", new User());
		return "Authentification";
	}

	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveUser(User user) {
		userRepository.save(user);
		return "redirect:/login";
	}
}