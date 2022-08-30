package com.example.study.dto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.study.entity.Member;

import lombok.Data;

@Data
public class TeamDto {
	
	private Long id;
	private Member member;
	private String teamName;
	private Integer personnel;
	private String esagaeseggi;
}
