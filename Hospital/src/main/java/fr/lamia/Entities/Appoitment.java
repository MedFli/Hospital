package fr.lamia.Entities;

import java.io.Serializable;

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
public class Appoitment{
	@Id
	@GeneratedValue
	private Long id_appoit;
	private String name;
	private String prenom;
	private String tel;
	private String adresse;
	private String message;
	private String email;
	private String motif;
}
