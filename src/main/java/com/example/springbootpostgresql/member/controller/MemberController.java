package com.example.springbootpostgresql.member.controller;

import com.example.springbootpostgresql.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public String goIndexPage(Model model) {

        model.addAttribute("memberList", memberService.getListAll());
        return "/index";
    }

}
