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
 * The Class Supplier.
 */
@Entity
@Table(name ="supplier")
public class Supplier {
	
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
    
    /** The email. */
    @Column(name = "email")
	private String email;
    
    /** The phone. */
    @Column(name = "phone")
   	private String phone;

    /** The supplier orders. */
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "supplier")
    private Set<PurchaseOrder> supplierOrders = new HashSet<>();

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
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the supplier orders.
	 *
	 * @return the supplier orders
	 */
	public Set<PurchaseOrder> getSupplierOrders() {
		return supplierOrders;
	}

	/**
	 * Sets the supplier orders.
	 *
	 * @param supplierOrders the new supplier orders
	 */
	public void setSupplierOrders(Set<PurchaseOrder> supplierOrders) {
		this.supplierOrders = supplierOrders;
	}
    
    

}
