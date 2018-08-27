package com.gms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.domain.MemberDTO;

@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member; /*이게 자바의 new member같이 스프링에서 가져오는 싱글톤객체*/
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
		logger.info("MemberController login 진입");
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
