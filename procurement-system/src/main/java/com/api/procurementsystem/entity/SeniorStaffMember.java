package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class SeniorStaffMember.
 */
@Entity
@Table(name = "senior_staff_member")
public class SeniorStaffMember extends AuthorizedEmp{
	
	/** The role. */
	@Column(name = "role")
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
