package com.example.Board2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Board2.dto.AccountDto;
import com.example.Board2.entity.Account;
import com.example.Board2.repository.AccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    //전체조회
    public List<Account> list(){
    	return accountRepository.findAll();
    }
    
    public Account getUser(Long id){
    	Optional<Account> account = accountRepository.findById(id); 
    	return account.get();
    }
    
    
    //저장하기
    public void save(Account account) {
    	accountRepository.save(account);
    }
    
    public void updateAcc(Account account) {
    	Account findacc = accountRepository.findById(account.getId()).get();
    	
    	findacc.setAccname(findacc.getAccname());
    	findacc.setBankname(findacc.getBankname());
    	accountRepository.save(findacc);
       
    	
    }
    
    
}
