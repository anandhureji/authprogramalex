package com.drmarkdown.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drmarkdown.auth.dtos.UserInfoDTO;
import com.drmarkdown.auth.dtos.UserLoginDTO;
import com.drmarkdown.auth.services.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	// -create user
	@PostMapping("/create")
	public UserInfoDTO createUser(@RequestBody UserInfoDTO userInfoDTO)
	{
		
		
		System.out.println(userInfoDTO.getDisplayName());
		System.out.println(userInfoDTO.getRoles());
		userService.createUser(userInfoDTO);
		return userInfoDTO;
	}
	
	// -get info about a specific user
	@GetMapping("/info/{userId}")
	public UserInfoDTO getUserInfo(@PathVariable Long userId) {
		System.out.println(userId);
		
		return userService.retrieveUserInfo(userId);
		
	}
	
	//login user
	@PostMapping("/login")
	public UserInfoDTO loginUser(@RequestBody UserLoginDTO userLoginDTO)
	{
		
		
		System.out.println(userLoginDTO.getUsername());
		System.out.println(userLoginDTO.getPassword());
		return userService.loginUser(userLoginDTO);
	}
	
	//- delete a user
	
	
	
	//- modify a user
}
