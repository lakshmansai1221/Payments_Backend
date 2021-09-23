package com.dbs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entities.Transaction;
import com.dbs.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository transactionItemRepository;

	@Autowired
	CustomerService customerService;
	
	@Autowired
	BankService bankBICService;
	
	@Autowired
	MessageService messageCodeService;
	
	public boolean checkBalance(String act_num,double amt)
	{
		double transaction_fee = (0.25/100)*amt;
		double total_amt_transfer = amt + transaction_fee;
		double clear_balance=customerService.findByAccountNum(act_num).getClear_balance();
		
		String check_overdraft = customerService.findByAccountNum(act_num).getOverdraft();
		
		if(total_amt_transfer < clear_balance)
		{
			return true;
		}
		else
		{
			if(check_overdraft.equals("yes"))
				return true;
			else
				return false;
		}
	}
		
	
	public Transaction insertTransaction(Transaction transaction)
	{
		return transactionItemRepository.save(transaction);
	}
	
}
