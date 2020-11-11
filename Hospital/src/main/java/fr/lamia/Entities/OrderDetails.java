package fr.lamia.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity 
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Order_Details")
public class OrderDetails implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	    @Column(name = "ID", length = 50, nullable = false)
	    private String id;
	 
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "ORDER_ID", nullable = false //
	          )
	    private Order order;
	 
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "PRODUCT_ID", nullable = false //
	          )
	    private Produit produit;
	 
	    @Column(name = "Quanity", nullable = false)
	    private int quanity;
	 
	    @Column(name = "Price", nullable = false)
	    private double price;
	 
	    @Column(name = "Amount", nullable = false)
	    private double amount;
}
