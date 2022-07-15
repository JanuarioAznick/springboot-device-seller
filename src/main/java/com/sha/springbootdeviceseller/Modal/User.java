package com.sha.springbootdeviceseller.Modal;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name="Users") // not User => because it is reserved.
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="username", nullable=false, unique=true, length=100)
	private String username;
	
	@Column(name="password", nullable=false, length=100)
	private String password;
	
	@Column (name="name", nullable=false, length=100)
	private String name;
	
	@Column(name="create_time", nullable=false)
	private LocalDateTime createTime;


	//Roles
	
	@Enumerated(EnumType.STRING)
	@Column(name="role", nullable=false)
	private Role role;
	
	@Transient
	private String token;

}
