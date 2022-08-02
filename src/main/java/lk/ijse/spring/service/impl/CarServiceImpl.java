package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDto;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void VehicleSave(CarDto dto) {
        if(!repo.existsById(dto.getCid())) {
            repo.save(mapper.map(dto, Car.class));
        } else {
            throw new RuntimeException("Car Already Exist...!");
        }

    }

    @Override
    public void DeleteVehicle(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Car Id.., No Such Car...!");
        }
    }

    @Override
    public void updateVehicle(CarDto dto) {
        if (repo.existsById(dto.getCid())) {
            repo.save(mapper.map(dto, Car.class));
        }
    }

    @Override
    public CarDto searchVehicle(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), CarDto.class);

        } else {
            throw new RuntimeException("No Car For"+ id +"...!");
        }
    }

    @Override
    public List<CarDto> getAllVehicles() {
        return mapper.map(repo.findAll(), new TypeToken<List<CarDto>>(){

        }.getType());
    }
}
