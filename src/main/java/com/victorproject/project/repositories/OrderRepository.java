package com.victorproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorproject.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		

}
