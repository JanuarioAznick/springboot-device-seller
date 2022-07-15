package com.sha.springbootdeviceseller.Repository.Projection;

import java.time.LocalDateTime;

import com.sha.springbootdeviceseller.Modal.DeviceType;

public interface PurchaseItem {
	
	String getName();
	DeviceType getDeviceType();
	Double getPrice();
	String getColor();
	LocalDateTime getPurchaseTime();

}
