package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, String> {

}
