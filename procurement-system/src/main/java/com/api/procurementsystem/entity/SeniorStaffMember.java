package com.api.procurementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "senior_staff_member")
public class SeniorStaffMember extends AuthorizedEmp{
	
	@Column(name = "role")
	private String role;

}
