package com.spring_ex.ums.member.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_ex.ums.member.model.dto.MemberDto;
import com.spring_ex.ums.member.service.MemberServiceImpl;

@Controller
public class MemberController {
	
	@Autowired
	MemberServiceImpl memberService;

	@RequestMapping("member/list.do")
	public String memberList(Model model) {
		List<MemberDto> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}
	
	@RequestMapping("member/write.do")
	public String memberWrite() {
		return "member/member_write";
	}
	
	@RequestMapping("member/insert.do")
	public String memberInsert(@ModelAttribute MemberDto dto) {
		memberService.insertMember(dto);
		
		return "redirect:/member/list.do";
	}
	
	@RequestMapping("member/view.do")
	public String memberView(String userId, Model model) {
		model.addAttribute("dto", memberService.viewMember(userId));
		return "member/member_view";
	}
	
	@RequestMapping("member/update.do")
	public String memberUpdate(@ModelAttribute MemberDto dto, Model model) {
		boolean result = memberService.checkPw(dto.getUserId(), dto.getUserPw());
		
		if(result) {
			memberService.updateMember(dto);
			return "redirect:/member/list.do";
		}
		else {
			MemberDto dto2 = memberService.viewMember(dto.getUserId());
			dto.setUserRegDate(dto2.getUserRegDate());
			dto.setUserUpdateDate(dto.getUserUpdateDate());
			model.addAttribute("dto", dto);
			model.addAttribute("msg", "비밀번호 불일치");
			
			return "member/member_view";
		}
	}
	
	@RequestMapping("member/delete.do")
	public String memberDelete(@RequestParam String userId, @RequestParam String userPw, Model model) {
		
		boolean result = memberService.checkPw(userId, userPw);
		
		if(result) {
			memberService.deleteMember(userId);
			return "redirect:/member/list.do";
		}
		else {
			model.addAttribute("msg", "비밀번호 불일치");
			model.addAttribute("dto", memberService.viewMember(userId));
			return "member/member_view";
		}
	}
}
