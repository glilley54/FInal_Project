package com.codeclan.example.doughdelivered;
import com.codeclan.example.doughdelivered.models.Customer;
import com.codeclan.example.doughdelivered.models.Item;
import com.codeclan.example.doughdelivered.models.Order;
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
//	public void customerHasOrderWithItems(){
//		Customer customer3 =new Customer("Bob","Fossil","bob@hello.com","40 Long road, Edinburgh, Eh2 1LM");
//		Item cheese = new Item("Mozzerella","Tasty cheese",08.00);
//		itemRepository.save(cheese);
//		Order order3 = new Order(customer3 ,"10/06/20");
//		orderRepository.save(order3);


//
//		assertEquals("John", customer.getFirstName);
	}

