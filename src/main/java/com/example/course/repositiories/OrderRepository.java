package com.example.course.repositiories;

import com.example.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
