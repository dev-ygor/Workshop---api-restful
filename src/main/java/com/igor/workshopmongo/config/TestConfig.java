package com.igor.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.igor.workshopmongo.domain.User;
import com.igor.workshopmongo.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userDAO;

	@Override
	public void run(String... args) throws Exception {
		
		userDAO.deleteAll();
		
		User daniel = new User(null, "Daniel Silva", "daniel@gmail.com");
		User maria = new User(null, "Maria Eduarda", "maria@gmail.com");
		User david = new User(null, "David Silva", "david@gmail.com");
		
		userDAO.saveAll(Arrays.asList(daniel, maria, david));
		
	}

}
