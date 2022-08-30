package com.example.Board2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Board2.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
