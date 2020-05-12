package fr.lamia.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.lamia.DAO.PatientRepository;
import fr.lamia.Entities.Patient;

@Controller
public class PatientControler {
	@Autowired
	private PatientRepository patientRepository;

	
	@GetMapping(path = "/addPatient")
	public String addPatient(Model model) {
		model.addAttribute("patient", new Patient());
		return "addPatient";
	}
	
@PostMapping("savePatient")
public String savePatient(Patient patient) {
	patientRepository.save(patient);
	return "redirect:/listpatients";
}
	@GetMapping(path = "/listpatients")
	public String list(Model model ,@RequestParam(name ="page", defaultValue ="1") int page ,
			                        @RequestParam (name ="size", defaultValue ="5") int size,
			                        @RequestParam(name ="keyword", defaultValue ="") String keyw ) {
		Page<Patient> lp = patientRepository.findByNameContains(keyw,PageRequest.of(page, size));
		model.addAttribute("listpatients",lp.getContent());
		model.addAttribute("pages",new int[lp.getTotalPages()]);
		model.addAttribute("currentPage",page);
		model.addAttribute("keyword",keyw);
		return "listpatients";
	}
	
	@GetMapping(path = "/deletepatient")
	public String deletepatient(Long id) {
		patientRepository.deleteById(id);
		return "redirect:/listpatients";
		
	}



}
