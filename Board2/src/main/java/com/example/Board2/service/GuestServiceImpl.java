package com.example.Board2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Board2.entity.Guest;
import com.example.Board2.repository.GuestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService {
	
	@Autowired
	private final GuestRepository guestRepository;
	
	public void save(Guest guest) {
		guestRepository.save(guest);
	}

}
