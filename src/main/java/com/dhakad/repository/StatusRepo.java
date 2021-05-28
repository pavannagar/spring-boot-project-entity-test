package com.dhakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.Status;
@Repository
public interface StatusRepo extends CrudRepository<Status, Integer> {

}
