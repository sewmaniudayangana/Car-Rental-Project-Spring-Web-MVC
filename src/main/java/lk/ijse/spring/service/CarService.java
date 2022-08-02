package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDto;

import java.util.List;

public interface CarService {
    void VehicleSave(CarDto  dto);
    void DeleteVehicle(String id);
    void updateVehicle(CarDto dto);
    CarDto searchVehicle(String id);
    List<CarDto> getAllVehicles();

}
