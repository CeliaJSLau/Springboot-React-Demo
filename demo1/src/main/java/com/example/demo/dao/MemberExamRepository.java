package com.example.demo.dao;


import  org.springframework.data.jpa.repository.JpaRepository;
import 	org.springframework.stereotype.Repository;

import  com.example.demo.model.MemberExam;

@Repository
public interface MemberExamRepository extends JpaRepository<MemberExam, Long>{

}
