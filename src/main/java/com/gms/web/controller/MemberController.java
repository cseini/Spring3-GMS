package com.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	/*이게 자바의 new member같이 스프링에서 가져오는 싱글톤객체*/
	@Autowired MemberService memberService;
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute("member") MemberDTO member) {
		logger.info("\n--------- MemberController {} !!-----","add()");
		String val = "";
		if(memberService.retrieve(member.getUserid())==null) {
			memberService.add(member);
			val="login_failed";
		} else {
			val="add_failed";
		}
		return val;
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve/{userid}")
	public String retrieve(Model model, @PathVariable String userid) {
		logger.info("\n--------- MemberController {} !!-----","retrieve()");
		MemberDTO m = memberService.retrieve(userid);
		model.addAttribute("user", m);
		return "retrieve";
	}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping(value="/modify/{userid}", method=RequestMethod.POST)
	public String modify(Model model,@ModelAttribute MemberDTO member,  @PathVariable String userid) {
		logger.info("\n--------- MemberController {} !!-----","modify()");
		member.setUserid(userid);
		memberService.modify(member);
		MemberDTO m = memberService.retrieve(userid);
		model.addAttribute("user", m);
		return "retrieve";
	}
	@RequestMapping(value="/remove/{userid}", method=RequestMethod.POST)
	public String remove(@ModelAttribute MemberDTO member, @PathVariable String userid){
		logger.info("\n--------- MemberController {} !!-----","remove()");
		member.setUserid(userid);
		memberService.remove(member);
		return "redirect:/";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Model model, @ModelAttribute("member") MemberDTO member) {
		logger.info("\n--------- MemberController {} !!-----","login()");
		String loginval = "login_failed";
		Map<String,String> p = new HashMap<>();
		p.put("userid", member.getUserid());
		if(memberService.login(member)) {
			MemberDTO m = memberService.retrieve(member.getUserid());
			model.addAttribute("user", m);
			loginval = "login_success";
		}
		return loginval;
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("\n--------- MemberController {} !!-----","logout()");
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
