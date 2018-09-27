package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="item")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    @Column(name = "name")
	private String name;
    
    @Column(name = "price")
   	private Float price;
    
    @Column(name = "quantity")
   	private Float quantity;
    
    @Column(name="unit")
    private String unit;
    
    @Column(name = "issued_quantity")
   	private Float issued_quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Float getIssued_quantity() {
		return issued_quantity;
	}

	public void setIssued_quantity(Float issued_quantity) {
		this.issued_quantity = issued_quantity;
	}

	
    
    

}
