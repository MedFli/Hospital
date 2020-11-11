package fr.lamia.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.lamia.DAO.ProduitRepository;
import fr.lamia.Entities.Produit;
@Controller
public class BoutiqueController {
	@Autowired
	ProduitRepository produitRepository;

	@GetMapping(path = "/boutique")
	public String boutique() {

		return "boutique";
	}
	@GetMapping(path = "/Panier")
	public String Panier() {

		return "Panier";
	}
	@RequestMapping(value = "addProduct",method = RequestMethod.GET)
	public String addProduct(Model model) {
		model.addAttribute("produit", new Produit());
		return "addProduct";
	}
	@RequestMapping(value = "saveProduct",method = RequestMethod.POST)
	public String savePatient(Produit produit) {
		produitRepository.save(produit);
		return "redirect:/boutique";
	} 

	@RequestMapping(value = "/infoProduct", method = RequestMethod.GET)
	public String getProduct(@RequestParam Long id,Produit produit) {
		produitRepository.findById(id);
		produitRepository.save(produit);
		return "infoProduct";
	}

}
