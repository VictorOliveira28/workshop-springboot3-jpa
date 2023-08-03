package com.victorproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorproject.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
		

}
