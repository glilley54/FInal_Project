package com.codeclan.example.doughdelivered;
import com.codeclan.example.doughdelivered.models.Customer;
import com.codeclan.example.doughdelivered.repositories.CustomerRepository;
import com.codeclan.example.doughdelivered.repositories.ItemRepository;
import com.codeclan.example.doughdelivered.repositories.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DoughDeliveredApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ItemRepository itemRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void customerHasFirstName(){
//		assertEquals("John", customer.getFirstName);
//	}
}
