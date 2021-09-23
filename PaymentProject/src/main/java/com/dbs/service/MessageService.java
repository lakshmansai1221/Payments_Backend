package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entities.Message;
import com.dbs.repository.MessageRepository;

@Service
public class MessageService {
	@Autowired
	MessageRepository messageCodeRepository;
	
	public Message findbyMsgcode(String msgcode)
	{
		java.util.Optional<Message> optmsgcode = messageCodeRepository.findById(msgcode);
		if(optmsgcode.isPresent())
		{
			return optmsgcode.get();
		}
		else
			return null;
	}
}
