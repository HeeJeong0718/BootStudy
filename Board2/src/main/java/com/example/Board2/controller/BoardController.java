package com.example.Board2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Board2.dto.GuestDto;
import com.example.Board2.entity.Account;
import com.example.Board2.entity.Guest;
import com.example.Board2.service.AccountService;
import com.example.Board2.service.GuestService;

@Controller
public class BoardController {
    @Autowired 
	//private GuestService guestService;
    private AccountService accountService; 
     
    /*@GetMapping("/")
     public String write() {
    	return "guest_form";
     }
    
    @PostMapping("createguest")
    public String write(Guest guest) {
    	guestService.save(guest);
    	return null;
    }*/
    
    @GetMapping("/") //홈화면
    public String write() {
   	return "acc_form";
    }
    
    @RequestMapping("/list")
    public String list(Model model) {
    	List<Account> lists =  accountService.list();
    	model.addAttribute("lists", lists);
        return "acc_list";
    }
    
    
    @PostMapping("create")
    public String makeacc(Account account) {
    	accountService.save(account);
    	 return "redirect:/list";
    }
    //상세화면
    @RequestMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
       Account account = accountService.getUser(id);
       model.addAttribute("account", account);
       return "acc_detail";
       
    }
    //수정하기
    @PostMapping("modify")
    public String accModify(Account account) {
     accountService.updateAcc(account);
     return "redirect:/list";
    }
    
}
