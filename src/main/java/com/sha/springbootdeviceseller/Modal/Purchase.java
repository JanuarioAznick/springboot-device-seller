package com.sha.springbootdeviceseller.Modal;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "purchases")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_id", nullable = false)
	private Long userId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
	private User user;
	
	@Column(name = "device_id", nullable = false)
	private Long deviceId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "device_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Device device;
	
	@Column(nullable = false)
	private Double price; 
	
	@Column(nullable = false)
	private String color;
	
	@Column(name = "purchase_time", nullable = false)
	private LocalDateTime purchaseTime;

}
