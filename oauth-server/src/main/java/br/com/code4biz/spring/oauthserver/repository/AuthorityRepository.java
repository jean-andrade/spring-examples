package br.com.code4biz.spring.oauthserver.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import  br.com.code4biz.spring.oauthserver.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}