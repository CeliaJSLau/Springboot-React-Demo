package com.example.demo.service.impl;


import com.example.demo.service.MemberService;
import com.example.demo.dao.MemberRepository;
import com.example.demo.model.Member;
import java.util.UUID;
import java.util.Date;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        member.setMid(UUID.randomUUID().toString().replaceAll("-", ""));
        member.setCreateTime(new Date());
        memberRepository.save(member);
        return member;
    }

}
