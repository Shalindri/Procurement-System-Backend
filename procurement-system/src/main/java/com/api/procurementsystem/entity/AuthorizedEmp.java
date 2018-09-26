package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="authorized_emp")
public class AuthorizedEmp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
	@Column(name = "type")
	private String type;
		
    @Column(name = "first_name")
	private String first_name;
    
    @Column(name = "second_name")
	private String second_name;
    
    @Column(name = "address")
   	private String address;
    
    @Column(name = "email")
	private String email;
    
    @Column(name = "phone")
   	private String phone;

}
