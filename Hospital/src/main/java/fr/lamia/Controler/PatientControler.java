package fr.lamia.Controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.lamia.DAO.MedecinRepository;
import fr.lamia.DAO.PatientRepository;
import fr.lamia.Entities.Patient;
import fr.lamia.Entities.medecin;

@Controller
public class PatientControler {
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private MedecinRepository medecinRepository;

	@RequestMapping(value = "addPatient",method = RequestMethod.GET)
	public String addPatient(Model model) {
		model.addAttribute("patient", new Patient());
		return "addPatient";
	}

	@RequestMapping(value = "savePatient",method = RequestMethod.POST)
	public String savePatient(Patient patient) {
		patientRepository.save(patient);
		return "redirect:/hospitalManagement";
	} 

	@RequestMapping(value = "/infoPatient", method = RequestMethod.GET)
	public String getPatient(@RequestParam Long id,Patient patient) {
		patientRepository.findById(id);
		patientRepository.save(patient);
		return "infoPatient";
	}
	
	@RequestMapping(value = "/ficheTechnique", method = RequestMethod.GET)
	public String infoTechnique() {
	
		return "ficheTechnique";
	}
	
	@GetMapping(path = "/Dentition")
	public String infoDent() {
	
		return "Dentition";
	}


	@GetMapping(path = "/deletepatient")
	public String deletepatient(Long id) {
		patientRepository.deleteById(id);
		return "redirect:/hospitalManagement";

	}

	@GetMapping(path = "/hospitalManagement")
	public String hospitalManagement(Model model) {
		List<Patient> lp = patientRepository.findAll();
		model.addAttribute("listpatients", lp);
		
		List<medecin> lm = medecinRepository.findAll();
		model.addAttribute("listmedecin", lm);
		return "hospitalManagement";

	}
	
	@GetMapping(path = "/Paiement")
	public String Paiement() {
	
		return "Paiement";
	}
	
}
