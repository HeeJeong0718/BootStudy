package com.example.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {
	@GetMapping("/test")
	public String testController() {
		
	 return "좋은곳 취업하자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
	}
}

// vo 는 body 값넣어주자나 raw 
 

// jpa 영속화 댄애들 그니까 테이블 테이블 이랑 맞추는거야 
// 이거를 하는이유가있어 
// 

/***
 * 1. vo 는 request response 에서 외부로 주고 받을때 사용함
 * 2. dto는 entity (jpa와 영속성 데이터 세팅을 할때 사용할것임! ) 
 * 3. vo(request) -> dto -> entity -> 동작 CRUD 
 * 4. 다시나갈떄 entity -> dto -> vo 외부라면 어디? 클라이언트 api로 사용할때? 
 * 응 유저가 글읽기를 하면 queryString 으로 파라미터를 보내주자나 그걸 vo 로 받아서 dto 에 데이터를 세팅하고 그걸 entitiy 에 데이터 세팅하고 commit 하는것임 백이랑 르론트 나눳을때?응!그럼 jpa도 api용으로도 사용을한다는말이네 jpa 는 음 그냥 jdbc 에 하이버네이트 올려서 그거 orm 으로 디비 조작 하려고 쓴다고 생각하면댐 
 * 근데 이것처럼 백프론트 안나눠져잇고 이러면 외부로 나갈일이없지않나  음 애초에 우리가 웹을하니까 api server를 만드는거라 안쓸수가없겠지??
 */