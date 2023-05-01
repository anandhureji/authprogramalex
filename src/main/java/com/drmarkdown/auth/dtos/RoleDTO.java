package com.drmarkdown.auth.dtos;

import java.util.Date;

public class RoleDTO {

	
	private String role;
	private Date createdAt;
	private Date updateAt;
	
	
	
	public RoleDTO(String role, Date createdAt, Date updateAt) {
		
		this.role = role;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}
	
	
	public RoleDTO() {
		
	}


	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
	
}
