package com.api.procurementsystem.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class SiteManager.
 */
@Entity
@Table(name = "site_manager")
public class SiteManager {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    /** The name. */
    @Column(name = "name")
	private String name;
    
    /** The contact num. */
    @Column(name="contact_num")
    private String contact_num;
    
    /** The purchase orders. */
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "site_manager")
    private Set<PurchaseOrder> purchaseOrders = new HashSet<>();
    
   


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
	 * Gets the purchase orders.
	 *
	 * @return the purchase orders
	 */
	public Set<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}

	/**
	 * Sets the purchase orders.
	 *
	 * @param purchaseOrders the new purchase orders
	 */
	public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	/**
	 * Gets the contact num.
	 *
	 * @return the contact num
	 */
	public String getContact_num() {
		return contact_num;
	}

	/**
	 * Sets the contact num.
	 *
	 * @param contact_num the new contact num
	 */
	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}
    
    
    

}
