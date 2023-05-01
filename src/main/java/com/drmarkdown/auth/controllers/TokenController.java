package com.drmarkdown.auth.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drmarkdown.auth.services.TokenService;



@RestController
@RequestMapping("/token")
public class TokenController {
	
	@Autowired
	private TokenService tokenService;
	
	@GetMapping("/validate")
	public void validateToken(HttpServletRequest httpServletRequest)throws Exception{
		
		//throw new Exception("some random exception");
		
		String jwtToken="";
		tokenService.validateToken(jwtToken);
		
	}

}
