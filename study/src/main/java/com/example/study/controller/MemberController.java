package com.example.study.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.dto.MemberDto;
import com.example.study.service.MemberService;
import com.example.study.vo.RequestCreateMember;
import com.example.study.vo.ResponseCreateMember;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {
	
	private final MemberService memberService ;
	
	@PostMapping("/member/join")
	public ResponseEntity<ResponseCreateMember> joinMember(@RequestBody RequestCreateMember requestCreateMember) {
		
		log.info("requestCreateMember ===>:{}", requestCreateMember);
		
		MemberDto memberDto = new MemberDto();
		
		memberDto.setName(requestCreateMember.getName());
		memberDto.setEmail(requestCreateMember.getEmail());
		
		ResponseCreateMember responseCreateMember = memberService.createMember(memberDto);
		
		return ResponseEntity.status(HttpStatus.OK).body(responseCreateMember);
	}
}

// 이해하셨나요? 네네 