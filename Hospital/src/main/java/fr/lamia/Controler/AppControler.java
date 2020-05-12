package fr.lamia.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	
}
