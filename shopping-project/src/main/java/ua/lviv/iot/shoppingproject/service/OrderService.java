package ua.lviv.iot.shoppingproject.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import ua.lviv.iot.shoppingproject.exceptions.OrderNotFoundException;
import ua.lviv.iot.shoppingproject.models.Order;
import ua.lviv.iot.shoppingproject.repository.OrderRepository;

@Service
@ApplicationScope
public class OrderService {

	@Autowired
	private OrderRepository repository;
	public Order addOrder(Order order) {

		return repository.save(order);
	}
	
	public Order updateOrder(Order order)  throws OrderNotFoundException{
		if(repository.existsById(order.getId())) {
			return repository.save(order);
		}
		throw new OrderNotFoundException("Order with id:" + order.getId() + "not found in the system");
	}
	
	public List<Order> getOrders() {
		return repository.findAll();
	}

	public Order getOrder(Integer id) {
		return repository.findById(id).orElseThrow();
	}
}
