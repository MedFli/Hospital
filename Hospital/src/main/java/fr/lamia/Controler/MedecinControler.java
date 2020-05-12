package fr.lamia.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.lamia.DAO.MedecinRepository;
import fr.lamia.Entities.medecin;

@Controller
public class MedecinControler {

	@Autowired
	private MedecinRepository medecinRepository;

	@GetMapping(path = "/listmedecin")
	public String list(Model model, @RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "size", defaultValue = "5") int size,
			@RequestParam(name = "keyword", defaultValue = "") String keyw) {
		Page<medecin> lm = medecinRepository.findByNameContains(keyw,PageRequest.of(page, size));
		model.addAttribute("listmedecin",lm.getContent());
		model.addAttribute("pages",new int[lm.getTotalPages()]);
		model.addAttribute("currentPage",page);
		model.addAttribute("keyword",keyw);
		return "listmedecin";
	}
	
	@GetMapping(path = "/deletemedecin")
	public String deletepatient(Long id) {
		medecinRepository.deleteById(id);

		return "redirect:/listmedecin";
	}
}

