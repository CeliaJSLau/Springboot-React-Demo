package com.example.demo.dao;

import  org.springframework.data.jpa.repository.JpaRepository;
import 	org.springframework.stereotype.Repository;

import  com.example.demo.model.MemberSkill;

@Repository
public interface MemberSkillRepository extends JpaRepository<MemberSkill, Long>{

}