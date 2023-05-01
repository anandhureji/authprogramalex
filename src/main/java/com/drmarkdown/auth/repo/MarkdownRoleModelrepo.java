package com.drmarkdown.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drmarkdown.auth.model.MarkdownRoleModel;
import org.springframework.stereotype.Repository;


@Repository

public interface MarkdownRoleModelrepo extends JpaRepository <MarkdownRoleModel,Long> {

}
