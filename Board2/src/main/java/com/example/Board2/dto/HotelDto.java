package com.example.Board2.dto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.Board2.entity.Guest;

import lombok.Data;

@Data
public class HotelDto {
	private Long guestid;
	
	private Guest guest;
	
	private String hoteName;
	
	private String hotelAddr;
	
	
}
