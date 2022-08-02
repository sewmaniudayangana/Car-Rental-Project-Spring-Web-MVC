package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDto;

import java.util.List;

public interface DriverService {
    void driverSave(DriverDto driverDTO);
    void deletedriver(String driverId);
    void updatedriver(DriverDto driverDTO);
    DriverDto serachdriver(String driverId);
    List<DriverDto> getAlldriver();
}
