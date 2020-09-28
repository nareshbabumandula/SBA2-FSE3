package com.iiht.coronakit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.iiht.coronakit.dao.UserRepository;
import com.iiht.coronakit.entity.Users;



@Component
public class AppStartUpEventHandler {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired	
	private PasswordEncoder penc;
	
	
	@EventListener
	public void onAppStartup(ApplicationReadyEvent event) {
		if(!userRepo.existsByUsername("Admin")) {
			userRepo.save(new Users("Admin", "admin123",penc.encode("admin123"),true,"admin@gmail.com","9502345628" , "ADMIN"));
		}
		
		if(!userRepo.existsByUsername("testuser01")) {
			userRepo.save(new Users("testuser01", "Secure*1234",penc.encode("Secure*1234"),true,"testuser01@gmail.com","8998345567" , "USER"));
		}
		if(!userRepo.existsByUsername("testuser02")) {
			userRepo.save(new Users("testuser02", "Secure*1234",penc.encode("Secure*1234"),true,"testuser02@gmail.com","6307567342" , "USER"));
		}
	}
}