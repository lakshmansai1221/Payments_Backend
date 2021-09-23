package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
