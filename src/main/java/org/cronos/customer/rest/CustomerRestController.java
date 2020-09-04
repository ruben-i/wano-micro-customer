package org.cronos.customer.rest;

import org.cronos.constant.Constant;
import org.cronos.customer.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Constant.API)
public class CustomerRestController {

	@GetMapping("/{dni}")
	public ResponseEntity<Customer> get(@PathVariable("dni") String dni) {
		Customer customer = new Customer();
		customer.setDni(dni);
		return ResponseEntity.ok(customer);
	}
	
	@PostMapping
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		
		return ResponseEntity.ok(customer);
	}
	
	@PutMapping("/{dni}")
	public ResponseEntity<Customer> update(@RequestBody Customer customer) {
		
		return ResponseEntity.ok(customer);
	}
	
	@DeleteMapping("/{dni}")
	public ResponseEntity<Customer> delete(@PathVariable("dni") String dni) {
		Customer customer = new Customer();
		customer.setDni(dni);
		return ResponseEntity.ok(customer);
	}
	
	@GetMapping("/random")
	public ResponseEntity<Customer> get() {
		Customer customer = new Customer();
		return ResponseEntity.ok(customer);
	}
}
