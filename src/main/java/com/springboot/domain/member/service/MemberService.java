package com.springboot.domain.member.service;

import com.springboot.domain.member.dto.MemberLogInRequestDto;
import com.springboot.domain.member.entity.Member;
import com.springboot.domain.member.entity.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.beans.Transient;
@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    @Transactional
    public Long logIn(MemberLogInRequestDto requestDto) {
        return memberRepository.save(requestDto.toEntity()).getId();


    }
}
