package com.drmarkdown.auth.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drmarkdown.auth.model.MarkdownUserModel;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkdownUserRepo extends JpaRepository <MarkdownUserModel,Long>{
	
	Optional<MarkdownUserModel> findByUsername(String username);
//	Optional<MarkdownUserModel> findByJwtToken(String jwtToken);
//	Optional<MarkdownUserModel> findByDisplayOrUsernameOrEmail(String username);

}
