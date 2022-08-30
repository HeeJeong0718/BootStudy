package com.example.study.service;

import com.example.study.dto.MemberDto;
import com.example.study.vo.ResponseCreateMember;

public interface MemberService {
	
	ResponseCreateMember createMember(MemberDto memberDto);
	
}
