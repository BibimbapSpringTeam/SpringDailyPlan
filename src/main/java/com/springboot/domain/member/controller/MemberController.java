package com.springboot.domain.member.controller;

import com.springboot.domain.member.dto.MemberLogInRequestDto;
import com.springboot.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor    //final이 붙은 필드에 대해 생성자 자동생성
//@Controller
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public Long logIn(@RequestBody MemberLogInRequestDto requestDto) {
        return memberService.logIn(requestDto);
    }
}




