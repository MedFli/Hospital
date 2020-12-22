package fr.lamia.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControler {


	@GetMapping(path = "/Cofun")
	public String Cofun() {

		return "Cofun";
	}

	@GetMapping(path = "/About")
	public String About() {

		return "About";
	}
	@GetMapping(path = "/boutique")
	public String boutique() {

		return "boutique";
	}
}
