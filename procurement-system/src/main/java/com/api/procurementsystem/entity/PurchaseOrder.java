package com.api.procurementsystem.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


/**
 * The Class PurchaseOrder.
 */
@Entity
@Table(name ="purchase_order")
public class PurchaseOrder {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
    /** The sequential ref. */
    @Column(name = "sequential_ref")
	private String sequential_ref;
    
    /** The order status. */
    @Column(name = "order_status")
   	private String order_status;
    
    /** The order date. */
    @Column(name = "order_date")
   	private Date order_date;
    
    /** The default order. */
    @Column(name = "default_order")
   	private boolean default_order;
    
    /** The on hold. */
    @Column(name = "on_hold")
   	private boolean on_hold;
    
    /** The total. */
    @Column(name="total")
    private float total;
    
    /** The site manager. */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manager_id", nullable = false)
    private SiteManager site_manager;
    
    /** The supplier. */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "supplier_id", nullable = false)
    private Supplier supplier;
  
  	 /** The items. */
 	  @ManyToMany(fetch = FetchType.LAZY,
  	            cascade = {
  	                CascadeType.PERSIST,
  	                CascadeType.MERGE
  	            })
  	    
  	    @JoinTable(name = "order_item",
  	            joinColumns = {@JoinColumn (name = "order_id") },
  	            inverseJoinColumns = { @JoinColumn(name = "item_id") })
  	    private Set<Item> items = new HashSet<>();
    
    

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
	 * Gets the site manager.
	 *
	 * @return the site manager
	 */
	@JsonIgnore
	public SiteManager getSite_manager() {
		return site_manager;
	}

	/**
	 * Sets the site manager.
	 *
	 * @param site_manager the new site manager
	 */
	@JsonProperty(access = Access.WRITE_ONLY)
	public void setSite_manager(SiteManager site_manager) {
		this.site_manager = site_manager;
	}

	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public Set<Item> getItems() {
		return items;
	}

	/**
	 * Sets the items.
	 *
	 * @param items the new items
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}

	/**
	 * Gets the order status.
	 *
	 * @return the order status
	 */
	public String getOrder_status() {
		return order_status;
	}

	/**
	 * Sets the order status.
	 *
	 * @param order_status the new order status
	 */
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	
	/**
	 * Gets the supplier.
	 *
	 * @return the supplier
	 */
	@JsonIgnore
	public Supplier getSupplier() {
		return supplier;
	}
	
	/**
	 * Sets the supplier.
	 *
	 * @param supplier the new supplier
	 */
	@JsonProperty(access = Access.WRITE_ONLY)
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	/**
	 * Gets the sequential ref.
	 *
	 * @return the sequential ref
	 */
	public String getSequential_ref() {
		return sequential_ref;
	}

	/**
	 * Sets the sequential ref.
	 *
	 * @param sequential_ref the new sequential ref
	 */
	public void setSequential_ref(String sequential_ref) {
		this.sequential_ref = sequential_ref;
	}

	/**
	 * Gets the order date.
	 *
	 * @return the order date
	 */
	public Date getOrder_date() {
		return order_date;
	}

	/**
	 * Sets the order date.
	 *
	 * @param order_date the new order date
	 */
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	/**
	 * Checks if is default order.
	 *
	 * @return true, if is default order
	 */
	public boolean isDefault_order() {
		return default_order;
	}

	/**
	 * Sets the default order.
	 *
	 * @param default_order the new default order
	 */
	public void setDefault_order(boolean default_order) {
		this.default_order = default_order;
	}

	/**
	 * Checks if is on hold.
	 *
	 * @return true, if is on hold
	 */
	public boolean isOn_hold() {
		return on_hold;
	}

	/**
	 * Sets the on hold.
	 *
	 * @param on_hold the new on hold
	 */
	public void setOn_hold(boolean on_hold) {
		this.on_hold = on_hold;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(float total) {
		this.total = total;
	}
    
    
    

}
