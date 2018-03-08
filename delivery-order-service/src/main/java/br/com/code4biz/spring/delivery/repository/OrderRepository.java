package br.com.code4biz.spring.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.code4biz.spring.delivery.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
