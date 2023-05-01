package com.drmarkdown.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MarkdownUserModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private Date createdAt;
	private Date updatedAt;
	private String username;
	private String display;
	private String jwtToken;
	private String password;

	@Column
	@ElementCollection(targetClass=String.class)
	private List<String> roles;
    private String email;

}
