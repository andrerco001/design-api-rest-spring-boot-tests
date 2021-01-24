package ca.springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyResource {
	
	@GetMapping("/customers/{id}")
	public Customer getDataCustomerById(@PathVariable Long id) {
		System.out.println(String.format("Id recived by url: %d", id));
		Customer customer = new Customer(1L, "Customer01", "000.000.000-00");
		
		return customer;
	}

}
