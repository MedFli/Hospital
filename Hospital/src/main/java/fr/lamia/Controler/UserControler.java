package fr.lamia.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.lamia.Entities.User;

public class UserControler {
	@Controller
	@RequestMapping({"/index" })
	public class IndexController {

	    @SuppressWarnings("unused")
		private final PasswordEncoder passwordEncoder;

	    @Autowired
	    public IndexController(PasswordEncoder passwordEncoder) {
	        this.passwordEncoder = passwordEncoder;
	    }

	    @GetMapping
	    public String main(Model model) {
	        model.addAttribute("user", new User());
	        return "Accueil";
	    }

	    @PostMapping
	    public String save(User user, Model model) {
	        model.addAttribute("user", user);
	        return "saved";
	        
	        
	        
	    }
}
}
