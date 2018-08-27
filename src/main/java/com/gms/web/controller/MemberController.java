package com.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member; /*이게 자바의 new member같이 스프링에서 가져오는 싱글톤객체*/
	@Autowired MemberService memberService;
	@RequestMapping("/add")
	public String add() {
		logger.info("MemberController add 진입");
		return "login_success";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public String retrieve() {
		logger.info("MemberController retrieve 진입");
		return "retrieve";
	}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping("/modify")
	public void modify() {}
	@RequestMapping("/remove")
	public void remove() {}
	@RequestMapping("/login")
	public String login() {
		logger.info("\n---------------- MemberController {} !!-");
		Map<String,String> p = new HashMap<>();
		p.put("userid", "A2");
		MemberDTO m = memberService.retrieve(p);
		System.out.println("--------------");
		System.out.println(m.getName());
		System.out.println("--------------");
		return "login_success";
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("MemberController logout 진입");
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
