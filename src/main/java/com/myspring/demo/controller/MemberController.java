package com.myspring.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.demo.model.Member;
import com.myspring.demo.service.MemberService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/members")
public class MemberController {
	private final MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}

	@GetMapping
	public List<Member> getMembers() {
		return service.getAllMembers();
	}

	@GetMapping("/{id}")
	public Member lookupMemberById(@PathVariable Long id) {
		return service.getMemberById(id).orElseThrow(() -> new RuntimeException("Member not found"));
	}

	@PostMapping
	public Member createMember(@RequestBody Member member) {
		return service.createMember(member);
	}
}
