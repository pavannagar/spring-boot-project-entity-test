package com.dhakad.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.Order_Table;
import com.dhakad.entity.Status;
@Repository
public interface Order_TableRepo extends CrudRepository<Order_Table, Integer> {

	
	
	@Modifying
	@Query("update Order_Table o set o.status=:status where o.orderId=:orderId")
	@Transactional
	public int changeStatus(@Param("orderId") int orderId , @Param("status") Status status);
	
	
	@Query("select o.status,o.amount from Order_Table as o where o.deliveryCharge=:orderId")
	public List<Object[]> getOrderStatus(@Param("orderId") int orderId);

	
	
	
	//@Query("select o.status,o.amount from Order_Table as o where o.orderId=:orderId")

	//deliveryCharge
}
