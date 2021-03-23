package com.example.demo.dao;


import  org.springframework.data.jpa.repository.JpaRepository;
import 	org.springframework.stereotype.Repository;

import  com.example.demo.model.ExamInfo;

@Repository
public interface ExamInfoRepository extends JpaRepository<ExamInfo, Long>{

}
