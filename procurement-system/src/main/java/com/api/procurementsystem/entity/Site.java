package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Site.
 */
@Entity
@Table(name ="site")
public class Site {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/** The name. */
	@Column(name = "name")
	private String name;
    
    /** The address. */
    @Column(name = "address")
   	private String address;
    
    /** The storage capacity. */
    @Column(name = "storage_capacity")
	private Float storage_capacity;
    
    /** The current capacity. */
    @Column(name = "current_capacity")
   	private Float current_capacity;
   

}
