package com.dhakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.OrderItem;
@Repository
public interface OrderItemRepo extends CrudRepository<OrderItem, Integer> {

}
