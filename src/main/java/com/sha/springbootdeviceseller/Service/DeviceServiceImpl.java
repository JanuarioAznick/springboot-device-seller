package com.sha.springbootdeviceseller.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.springbootdeviceseller.Modal.Device;
import com.sha.springbootdeviceseller.Repository.DeviceRepository;

@Service
public class DeviceServiceImpl implements DeviceService{
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	public DeviceServiceImpl(DeviceRepository deviceRepository) {
		this.deviceRepository = deviceRepository;
	}
	
	@Override
	public Device saveDevice(Device device) {
		
		device.setCreateTime(LocalDateTime.now());
		
		return deviceRepository.save(device);
	}
	
	@Override
	public void deleteDevice(Long id) {
		
		deviceRepository.deleteById(id);
	}

	@Override
	public List<Device> findAllDevices() {
		
		return deviceRepository.findAll();
	}
}
