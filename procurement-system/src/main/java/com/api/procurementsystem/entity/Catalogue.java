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


@Entity
@Table(name = "Catalogue")
public class Catalogue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
    @Column(name = "name")
	private String name;
    
    @Column(name = "price")
   	private Float price;
	
	@Column(name = "delivery_information")
	private String delivery_information;
    
    @Column(name = "is_restricted")
   	private boolean is_restricted;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Category category;

    public Catalogue() {
    	
    }
    
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

	public String getDelivery_information() {
		return delivery_information;
	}

	public void setDelivery_information(String delivery_information) {
		this.delivery_information = delivery_information;
	}

	public boolean isIs_restricted() {
		return is_restricted;
	}

	public void setIs_restricted(boolean is_restricted) {
		this.is_restricted = is_restricted;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


}
