package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;



/**
 * The Class Catalogue.
 */
@Entity
@Table(name = "Catalogue")
public class Catalogue {
	
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
	
	/** The delivery information. */
	@Column(name = "delivery_information")
	private String delivery_information;
    
    /** The is restricted. */
    @Column(name = "is_restricted")
   	private boolean is_restricted;
    
    /** The category. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Category category;

    /**
     * Instantiates a new catalogue.
     */
    public Catalogue() {
    	
    }
    
	/**
	 * Instantiates a new catalogue.
	 *
	 * @param id the id
	 * @param name the name
	 * @param price the price
	 * @param delivery_information the delivery information
	 * @param is_restricted the is restricted
	 * @param category the category
	 */
	public Catalogue(Long id, String name, Float price, String delivery_information, boolean is_restricted,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.delivery_information = delivery_information;
		this.is_restricted = is_restricted;
		this.category = category;
	}

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
	 * Gets the delivery information.
	 *
	 * @return the delivery information
	 */
	public String getDelivery_information() {
		return delivery_information;
	}

	/**
	 * Sets the delivery information.
	 *
	 * @param delivery_information the new delivery information
	 */
	public void setDelivery_information(String delivery_information) {
		this.delivery_information = delivery_information;
	}

	/**
	 * Checks if is checks if is restricted.
	 *
	 * @return true, if is checks if is restricted
	 */
	public boolean isIs_restricted() {
		return is_restricted;
	}

	/**
	 * Sets the checks if is restricted.
	 *
	 * @param is_restricted the new checks if is restricted
	 */
	public void setIs_restricted(boolean is_restricted) {
		this.is_restricted = is_restricted;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}


}
