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


@Entity
@Table(name ="purchase_order")
public class PurchaseOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
    @Column(name = "sequential_ref")
	private String sequential_ref;
    
    @Column(name = "order_status")
   	private String order_status;
    
    @Column(name = "order_date")
   	private Date order_date;
    
    @Column(name = "default_order")
   	private boolean default_order;
    
    @Column(name = "on_hold")
   	private boolean on_hold;
    
    @Column(name="total")
    private float total;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manager_id", nullable = false)
    private SiteManager site_manager;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "supplier_id", nullable = false)
    private Supplier supplier;
  
  	 @ManyToMany(fetch = FetchType.LAZY,
  	            cascade = {
  	                CascadeType.PERSIST,
  	                CascadeType.MERGE
  	            })
  	    
  	    @JoinTable(name = "order_item",
  	            joinColumns = {@JoinColumn (name = "order_id") },
  	            inverseJoinColumns = { @JoinColumn(name = "item_id") })
  	    private Set<Item> items = new HashSet<>();
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	 
	@JsonIgnore
	public SiteManager getSite_manager() {
		return site_manager;
	}

	@JsonProperty(access = Access.WRITE_ONLY)
	public void setSite_manager(SiteManager site_manager) {
		this.site_manager = site_manager;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	
	@JsonIgnore
	public Supplier getSupplier() {
		return supplier;
	}
	@JsonProperty(access = Access.WRITE_ONLY)
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getSequential_ref() {
		return sequential_ref;
	}

	public void setSequential_ref(String sequential_ref) {
		this.sequential_ref = sequential_ref;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public boolean isDefault_order() {
		return default_order;
	}

	public void setDefault_order(boolean default_order) {
		this.default_order = default_order;
	}

	public boolean isOn_hold() {
		return on_hold;
	}

	public void setOn_hold(boolean on_hold) {
		this.on_hold = on_hold;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
    
    
    

}
