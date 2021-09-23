package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
