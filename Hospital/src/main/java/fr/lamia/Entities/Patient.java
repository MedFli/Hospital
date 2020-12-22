package fr.lamia.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Patient {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String prenom;
	private Boolean malade = true;
	private String date_Naissance;
	private String adresse;
	private long numero_tel;
}
