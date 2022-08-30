package com.example.Board2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Builder
public class Hotel {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long guestid;
	@ManyToOne(fetch = FetchType.LAZY)
	private Guest guest;
	@Column(name="hotel_name", length=15)
	private String hoteName;
	@Column(name="hotel_addr" , length=30)
	private String hotelAddr;
	
	
}
