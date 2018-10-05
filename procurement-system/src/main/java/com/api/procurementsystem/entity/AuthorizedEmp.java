package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * The Class AuthorizedEmp.
 */
@Entity
@Table(name ="authorized_emp")
public class AuthorizedEmp {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
	/** The type. */
	@Column(name = "type")
	private String type;
		
    /** The first name. */
    @Column(name = "first_name")
	private String first_name;
    
    /** The second name. */
    @Column(name = "second_name")
	private String second_name;
    
    /** The address. */
    @Column(name = "address")
   	private String address;
    
    /** The email. */
    @Column(name = "email")
	private String email;
    
    /** The phone. */
    @Column(name = "phone")
   	private String phone;

}
