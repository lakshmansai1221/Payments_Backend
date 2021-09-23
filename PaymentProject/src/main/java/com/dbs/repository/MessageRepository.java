package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entities.Message;

public interface MessageRepository extends JpaRepository<Message, String> {

}
