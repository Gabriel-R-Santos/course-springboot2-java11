package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus , Long> {

}
