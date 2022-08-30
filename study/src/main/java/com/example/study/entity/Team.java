package com.example.study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Builder
@Table(name = "tb_team")
public class Team {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 마이바티스 , 오라클 , 마이에스큐엘 쓰는 방식이 다다름!
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Member member;
	@Column(name = "team_name" , length = 15)
	private String teamName;
	@Column(name = "personnel")
	private Integer personnel;	
	private String esagaeseggi;

}
