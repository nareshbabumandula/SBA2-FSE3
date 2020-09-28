package com.iiht.coronakit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.coronakit.dao.UserRepository;
import com.iiht.coronakit.entity.Users;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	@Override
	public Users getUserDetails(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}

}
