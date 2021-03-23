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
@Table(name = "certificate")
public class Certificate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "certificate_id", unique = true, nullable = false)
	private Long certificateId;
	@NonNull
	@Column(name = "name", unique = true, nullable = false, length = 50)
	private String name;
	@ManyToOne
	@JoinColumn(name = "skill_id")
	@NonNull
	private Skill skill;
	@ManyToOne
	@JoinColumn(name = "company_id")
	@NonNull
	private Company company;

}