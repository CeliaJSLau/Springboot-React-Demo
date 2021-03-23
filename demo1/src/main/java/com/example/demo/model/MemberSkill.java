package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "member_skill")
public class MemberSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_skill_id", unique = true, nullable = false)
	private Long memberSkillId;
	@ManyToOne
	@JoinColumn(name = "mid")
	@NonNull
	private Member member;
	@ManyToOne
	@JoinColumn(name = "skill_id")
	@NonNull
	private Skill skill;

}