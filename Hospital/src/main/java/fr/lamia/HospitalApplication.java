package fr.lamia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.lamia.DAO.MedecinRepository;
import fr.lamia.DAO.PatientRepository;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {
	@Autowired
  private PatientRepository patientRepository;
	@Autowired
	private MedecinRepository medecinRepository;

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		medecinRepository.findAll().forEach(m->{
			System.out.println(m.toString());
		}
				);
		patientRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		}
				);
	
			
		}
		
	}

