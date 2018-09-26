package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="site")
public class Site {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
    
    @Column(name = "address")
   	private String address;
    
    @Column(name = "storage_capacity")
	private Float storage_capacity;
    
    @Column(name = "current_capacity")
   	private Float current_capacity;
   

}
