package com.example.Board2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
@Builder
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long guestid;
    
    @Column(name="name", length=15)
    private String name;
    @Column(name="addr", length=20)
    private String addr;
    
    
}
