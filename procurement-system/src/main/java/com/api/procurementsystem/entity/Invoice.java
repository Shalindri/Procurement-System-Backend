package com.api.procurementsystem.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    @Column(name = "issue_date")
   	private Date issue_date;
    
    @Column(name = "total_amount")
   	private Float total_amount;
    
    @Column(name = "sequential_ref")
   	private String sequential_ref;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}

	public String getSequential_ref() {
		return sequential_ref;
	}

	public void setSequential_ref(String sequential_ref) {
		this.sequential_ref = sequential_ref;
	}
    
    
    

}
