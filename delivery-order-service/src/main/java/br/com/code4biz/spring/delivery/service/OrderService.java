package br.com.code4biz.spring.delivery.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.code4biz.spring.delivery.model.Order;
import br.com.code4biz.spring.delivery.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	public Order save(@Validated Order order) {
		return orderRepository.save(order);
	}

	public Order findById(Integer id) {
		Optional<Order> order = orderRepository.findById(id);
		return order.get();
	}

	public Iterable<Order> findAll() {
		return orderRepository.findAll();
	}

	public void delete(Integer id) {
		orderRepository.deleteById(id);;
	}
}
