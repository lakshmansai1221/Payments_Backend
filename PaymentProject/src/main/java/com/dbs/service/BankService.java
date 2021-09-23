package com.dbs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entities.Bank;
import com.dbs.repository.BankRepository;

@Service
public class BankService {
	@Autowired
	BankRepository bankBICRepository;
	
	public Bank findByBIC(String bankbic) {
		Optional<Bank> optBIC=bankBICRepository.findById(bankbic);
		if(optBIC.isPresent()) {
			return optBIC.get();
		}
		else {
			return null;
		}
	}
}
