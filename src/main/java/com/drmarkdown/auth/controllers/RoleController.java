package com.drmarkdown.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drmarkdown.auth.dtos.RoleDTO;
import com.drmarkdown.auth.dtos.UserInfoDTO;
import com.drmarkdown.auth.services.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	
	@PostMapping("/create")
	public RoleDTO createrole(@RequestBody RoleDTO roleDTO)
	{
		
		
		System.out.println(roleDTO.getRole());
		System.out.println();
		return roleService.createRole(roleDTO);
	}
	
	
	@GetMapping("/info/{roleId}")
	public RoleDTO getroleInfo(@PathVariable String roleId) {
		System.out.println(roleId);
		
		return roleService.roleInfo(roleId);
	}
}
