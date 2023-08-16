package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.AccountEntity;

public interface UserRepository extends JpaRepository<AccountEntity, Long> {
	AccountEntity findOneByUserNameAndStatus(String name, int status); 
}
