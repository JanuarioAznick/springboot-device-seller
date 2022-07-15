package com.sha.springbootdeviceseller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.springbootdeviceseller.Modal.Device;

public interface DeviceRepository extends JpaRepository<Device, Long>{

}
