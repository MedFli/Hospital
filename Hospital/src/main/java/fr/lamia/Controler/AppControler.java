package fr.lamia.Controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.lamia.DAO.PatientRepository;
import fr.lamia.Entities.Patient;

@Controller
public class AppControler {

	@GetMapping(path = "/index")
	public String index() {

		return "index";
	}
	
	@GetMapping(path = "/Home")
	public String home() {
		
		return "Home";
	}
	
	@GetMapping(path = "/Cofun")
	public String Cofun() {
		
		return "Cofun";
	}
	@GetMapping(path = "/Contact")
	public String Contact() {
		
		return "Contact";
	}
	
	@GetMapping(path = "/About")
	public String About() {
		
		return "About";
	}

}
