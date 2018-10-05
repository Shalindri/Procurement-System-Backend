package com.api.procurementsystem.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Invoice.
 */
@Entity
@Table(name ="invoice")
public class Invoice {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    /** The issue date. */
    @Column(name = "issue_date")
   	private Date issue_date;
    
    /** The total amount. */
    @Column(name = "total_amount")
   	private Float total_amount;
    
    /** The sequential ref. */
    @Column(name = "sequential_ref")
   	private String sequential_ref;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the issue date.
	 *
	 * @return the issue date
	 */
	public Date getIssue_date() {
		return issue_date;
	}

	/**
	 * Sets the issue date.
	 *
	 * @param issue_date the new issue date
	 */
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	/**
	 * Gets the total amount.
	 *
	 * @return the total amount
	 */
	public Float getTotal_amount() {
		return total_amount;
	}

	/**
	 * Sets the total amount.
	 *
	 * @param total_amount the new total amount
	 */
	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}

	/**
	 * Gets the sequential ref.
	 *
	 * @return the sequential ref
	 */
	public String getSequential_ref() {
		return sequential_ref;
	}

	/**
	 * Sets the sequential ref.
	 *
	 * @param sequential_ref the new sequential ref
	 */
	public void setSequential_ref(String sequential_ref) {
		this.sequential_ref = sequential_ref;
	}
    
    
    

}
