package com.iiht.coronakit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.coronakit.entity.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, String>{
	boolean existsByUsername(String userName); 
	Users findByUsername(String username); 
}
