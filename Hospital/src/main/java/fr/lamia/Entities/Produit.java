package fr.lamia.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.cloud.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Entity 
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produit {
	 @Id @GeneratedValue
	    @Column(name = "Code", length = 20, nullable = false)
	    private Long code;
	 
	    @Column(name = "Name", length = 255, nullable = false)
	    private String name;
	 
	    @Column(name = "Price", nullable = false)
	    private double price;
	 
	    @Lob
	    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
	    private byte[] image;
	    
	    private String designation;
	    
	    private Long quantite;
}
