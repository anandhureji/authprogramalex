package com.drmarkdown.auth.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.drmarkdown.auth.dtos.UserInfoDTO;
import com.drmarkdown.auth.dtos.UserLoginDTO;
import com.drmarkdown.auth.model.MarkdownUserModel;
import com.drmarkdown.auth.repo.MarkdownUserRepo;

@Service
public class UserService {
	
	
@Autowired
 ModelMapper modelMapper;

@Autowired
MarkdownUserRepo markdownUserRepo;


@Autowired 
BCryptPasswordEncoder bcryptPasswordEncoder;
	
	public UserInfoDTO createUser(UserInfoDTO userInfoDTO) {
		
		MarkdownUserModel markdownUserModel=modelMapper.map(userInfoDTO, MarkdownUserModel.class);
		
		//hash the password 
		
		markdownUserRepo.save(markdownUserModel);
		modelMapper.map(markdownUserModel, userInfoDTO);
		return null;
	}
	
	public UserInfoDTO retrieveUserInfo(Long userId) {
		
	Optional<MarkdownUserModel> optionalmarkdownUserModel=markdownUserRepo.findById(userId);
	
	if(optionalmarkdownUserModel.isPresent()) {
		
		return modelMapper.map(optionalmarkdownUserModel.get(), UserInfoDTO.class);
		
	}
		return null;
	}
	
	
	//
	public UserInfoDTO loginUser(UserLoginDTO userLoginDTO) {
	
		Optional<MarkdownUserModel> optionalmarkdownUserModel= markdownUserRepo.findByUsername(userLoginDTO.getUsername());
		if(optionalmarkdownUserModel.isPresent()) {
			
			MarkdownUserModel markdownUserModel=optionalmarkdownUserModel.get();
			
			//check if password match or not
			
		}
		return null;
	}

}
