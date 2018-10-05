package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class GoodReceipt.
 */
@Entity
@Table(name ="good_receipt")
public class GoodReceipt {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
    /** The receipt id. */
    @Column(name = "receipt_id")
   	private String receipt_id;
    
    /** The order details. */
    @Column(name = "order_details")
   	private Float order_details;

}
