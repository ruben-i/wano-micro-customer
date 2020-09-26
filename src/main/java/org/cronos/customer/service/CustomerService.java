package org.cronos.customer.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.cronos.customer.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Value("${cronos.message.general}")
	private String message;
	
	public Customer getByDni(String dni) {
		return create(dni);
	}
	
	public Customer delete(String dni) {
		return create(dni);
	}
	
	private Customer create(String dni) {
		Customer customer = new Customer();
		customer.setFirstName(UUID.randomUUID().toString().substring(0, 16));
		customer.setLastName(UUID.randomUUID().toString().substring(0, 24));
		customer.setCreation(LocalDateTime.now());
		customer.setEmail(UUID.randomUUID().toString().substring(0, 20)+"@gmail.com");
		customer.setDni(dni);
        customer.setFrom(message);	
        return customer;
	}
}
