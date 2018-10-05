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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The Class Category.
 */
@Entity
@Table(name = "Category")
public class Category {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    /** The name. */
    @Column(name = "name")
	private String name;
    
    
    
    /** The items. */
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "category")
    @JsonIgnore
    private Set<Catalogue> items = new HashSet<>();
    
    
    /**
     * Instantiates a new category.
     */
    public Category() {
    	
    }
    

	/**
	 * Instantiates a new category.
	 *
	 * @param id the id
	 */
	public Category(Long id) {
		super();
		this.id = id;
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
	 * Gets the items.
	 *
	 * @return the items
	 */
	public Set<Catalogue> getItems() {
		return items;
	}

	/**
	 * Sets the items.
	 *
	 * @param items the new items
	 */
	public void setItems(Set<Catalogue> items) {
		this.items = items;
	}


    
    

}
