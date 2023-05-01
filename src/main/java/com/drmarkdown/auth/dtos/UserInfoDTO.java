package com.drmarkdown.auth.dtos;

import java.util.Date;
import java.util.List;

public class UserInfoDTO {
	
	private String username;
	private String displayName;
	private String password;
	private List<String> roles;
	private String email;
	private Date createdAt;
	private Date modifiedAt;
	
	
	
	public UserInfoDTO() {
		
	}
	
	public UserInfoDTO(String username, String displayName, String password, List<String> roles, String email,
			Date createdAt, Date modifiedAt) {
		super();
		this.username = username;
		this.displayName = displayName;
		this.password = password;
		this.roles = roles;
		this.email = email;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	

}
