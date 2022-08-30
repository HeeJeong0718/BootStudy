package com.example.Board2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Board2.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest , Long> {

}
