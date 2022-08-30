package com.example.Board2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Board2.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
