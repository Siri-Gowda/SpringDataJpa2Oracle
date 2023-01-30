package com.springboot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpa2OracleApplication implements CommandLineRunner{
 
	@Autowired
	private CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa2OracleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Customer> listCustomer=customerRepository.findAll();
		
		listCustomer.forEach(System.out::println);
		
	}

}
