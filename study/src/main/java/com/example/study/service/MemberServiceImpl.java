package com.example.study.service;

import org.springframework.stereotype.Service;

import com.example.study.dto.MemberDto;
import com.example.study.entity.Member;
import com.example.study.repository.MemberRepository;
import com.example.study.vo.ResponseCreateMember;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository memberRepository;
	
	@Override
	public ResponseCreateMember createMember(MemberDto memberDto) {
			
		Member member = Member.builder()
				.email(memberDto.getEmail())
				.name(memberDto.getName())
				.build();
		
		memberRepository.save(member);
		
		ResponseCreateMember responseCreateMember = new ResponseCreateMember();
		
		responseCreateMember.setId(member.getId());
		responseCreateMember.setName(member.getName());
		responseCreateMember.setEmail(member.getEmail());
		
		return responseCreateMember;
	}
}
