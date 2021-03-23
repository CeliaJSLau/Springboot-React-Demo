package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import  com.example.demo.model.Member;
import  com.example.demo.model.Vendor;
import org.springframework.boot.CommandLineRunner;
import com.example.demo.service.MemberService;
@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;
    private VendorRepository vendorRepository;

    MemberService memberService;
    @Override
    public void run(String... args) throws Exception {

//    Member member = new Member("tom@gmail.com", "abc12345", "tom", "cruise");
//    memberService.saveMember(member);
//    memberRepository.save(member);
    
//    Vendor vendor = new Vendor();
//    vendor.setName("Joe");
//    vendor.setVendorId(new Long(222));
//    vendorRepository.save(vendor);
    
    }
}