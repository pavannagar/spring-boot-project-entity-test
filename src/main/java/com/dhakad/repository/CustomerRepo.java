package com.dhakad.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	@Modifying
	@Query("update Customer c set c.password=:password where c.customerId=:custid")
	@Transactional
	public int changePassword(@Param("custid") int custId,@Param("password") String password);








/*
	@Modifying
	@Query("update User u set u.active = false where u.lastLoginDate < :date")
	void deactivateUsersNotLoggedInSince(@Param("date") LocalDate date);
*/

}



