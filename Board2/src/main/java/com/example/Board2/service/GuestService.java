package com.example.Board2.service;

import org.springframework.stereotype.Service;

import com.example.Board2.dto.GuestDto;
import com.example.Board2.entity.Guest;
import com.example.Board2.repository.GuestRepository;

import lombok.RequiredArgsConstructor;

@Service

public interface GuestService {
   
	 //Guest createGuest(GuestDto guestDto);
   	  
	public void save(Guest guest);

	
}
