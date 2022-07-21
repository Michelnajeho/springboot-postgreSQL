package com.example.springbootpostgresql.member.service;

import com.example.springbootpostgresql.member.entity.Member;
import com.example.springbootpostgresql.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getListAll() {
        return memberRepository.findAll();
    }

}
