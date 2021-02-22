package ca.springboot.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class MyResource {

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer save(@RequestBody Customer customer) {
		// service.save(customer);
		return customer;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		// service.getById(id);
		// service.delete(customer);
	}
	
	@PutMapping("{id}")
	public Customer update(@PathVariable Long id, @RequestBody Customer customer) {
		// service.getById(id);
		// service.update(customer);
		return customer;
	}

	@GetMapping("{id}")
	public Customer getDataCustomerById(@PathVariable Long id) {
		System.out.println(String.format("Id recived by url: %d", id));
		Customer customer = new Customer(1L, "Customer01-new", "111.111.111-11");
		return customer;
	}

}
