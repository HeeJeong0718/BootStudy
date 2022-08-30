package com.example.study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;

 
@Entity
@Getter
@Builder
@Table(name = "tb_member")
public class Member {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name" , length = 15)
	private String name;
	@Column(name = "eamil" , length = 20)
	private String email;

	
}

//  백오피스 연결 외부 api 연결 해야할때야 

// 클라이가(유저) -> post -> 그걸저장시켜 -> 백오피스한테 저장된값을 줘 -> 그럼 백오피스도 그값을 저장 시킴
//@Transactional <- 아하! 나중에 보게될거야~~>_< 
// jpa 쓸때 양방향 쓰는 경우가 있을수 있겠지만 
// 웬만하면 단방향으로 충분하니까 단방향으로 쓰자! 