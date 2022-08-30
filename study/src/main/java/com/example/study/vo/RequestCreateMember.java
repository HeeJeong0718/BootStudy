package com.example.study.vo;

import lombok.Data;

@Data
public class RequestCreateMember {
	private String name;
	private String email;
	private MemberInfo memberInfo;
	
}
