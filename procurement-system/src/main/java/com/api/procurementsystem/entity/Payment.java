package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class Payment.
 */
@Entity
@Table(name ="payment")
public class Payment {

	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
    /** The payment method. */
    @Column(name = "payment_mehthod")
   	private String payment_method;
    
    /** The total amount. */
    @Column(name = "total_amount")
   	private Float total_amount;
}
