package com.sha.springbootdeviceseller.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.springbootdeviceseller.Modal.Device;
import com.sha.springbootdeviceseller.Service.DeviceService;

@RestController
@RequestMapping("api/device")//pre-path
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@PostMapping
	public ResponseEntity<?> saveDevice(@RequestBody Device device) {
		
		return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);		
		
	}
	
	@DeleteMapping("{deviceId}")//api/device/{deviceId}
	public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId){
		
		deviceService.deleteDevice(deviceId);
		
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@GetMapping //api/device
	public ResponseEntity<?> getAllDevices(){
		return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
	}

}
