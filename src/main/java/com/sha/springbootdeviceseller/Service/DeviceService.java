package com.sha.springbootdeviceseller.Service;

import java.util.List;

import com.sha.springbootdeviceseller.Modal.Device;

public interface DeviceService {

	Device saveDevice(Device device);

	void deleteDevice(Long id);

	List<Device> findAllDevices();

}
