package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Item.
 */
@Entity
@Table(name ="item")
public class Item {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    /** The name. */
    @Column(name = "name")
	private String name;
    
    /** The price. */
    @Column(name = "price")
   	private Float price;
    
    /** The quantity. */
    @Column(name = "quantity")
   	private Float quantity;
    
    /** The unit. */
    @Column(name="unit")
    private String unit;
    
    /** The issued quantity. */
    @Column(name = "issued_quantity")
   	private Float issued_quantity;

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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * Gets the unit.
	 *
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets the unit.
	 *
	 * @param unit the new unit
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public Float getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the issued quantity.
	 *
	 * @return the issued quantity
	 */
	public Float getIssued_quantity() {
		return issued_quantity;
	}

	/**
	 * Sets the issued quantity.
	 *
	 * @param issued_quantity the new issued quantity
	 */
	public void setIssued_quantity(Float issued_quantity) {
		this.issued_quantity = issued_quantity;
	}

	
    
    

}
