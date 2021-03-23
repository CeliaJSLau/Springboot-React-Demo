package com.example.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "members")
public class Member {

	@Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "mid", unique = true, nullable = false, length = 50)
	private String mid;
	@NonNull
    @NotEmpty
	@Column(name = "email", unique = true, nullable = false, length = 50)
	private String email;
	@NonNull
    @NotEmpty
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	@NonNull
    @NotEmpty
	@Column(name = "first_name", nullable = false, length = 50)
	private String firstName;
	@NonNull
    @NotEmpty
	@Column(name = "last_name", nullable = false, length = 50)
	private String lastName;
	@Column(name = "create_time")
	private Date createTime;
	@Column(name = "update_time")
	private Date updateTime;

}