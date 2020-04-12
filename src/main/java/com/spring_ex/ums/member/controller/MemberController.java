package com.spring_ex.ums.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_ex.ums.member.model.dto.MemberDto;
import com.spring_ex.ums.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("member/list.do")
	public String memberList(Model model) {
		List<MemberDto> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}
}
