package com.dbs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entities.Customer;
import com.dbs.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	public Customer findByAccountNum(String accno) {
		Optional<Customer> optCust = customerRepository.findById(accno);
		if (optCust.isPresent()) {
			return optCust.get();
		} else {
			return null;
		}
	}

	public void updateClearBalance(String acc_num, double amt) {

		Customer customer = findByAccountNum(acc_num);
		customer.setClear_balance(customer.getClear_balance() - amt);
		Customer c1 = customerRepository.save(customer);

	}
}
