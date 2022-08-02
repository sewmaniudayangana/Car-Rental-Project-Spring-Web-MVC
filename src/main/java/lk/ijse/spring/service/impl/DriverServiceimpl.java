package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDto;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DriverServiceimpl implements DriverService {
    @Autowired
    private DriverRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void driverSave(DriverDto driverDTO) {
        if (!repo.existsById(driverDTO.getDid())) {
            repo.save(mapper.map(driverDTO, Driver.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deletedriver(String driverId) {
        if (repo.existsById(driverId)) {
            repo.deleteById(driverId);
        } else {
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updatedriver(DriverDto driverDTO) {
        if (repo.existsById(driverDTO.getDid())) {
            repo.save(mapper.map(driverDTO, Driver.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    @Override
    public DriverDto serachdriver(String driverId) {
        if (repo.existsById(driverId)) {
            return mapper.map(repo.findById(driverId).get(), DriverDto.class);
        } else {
            throw new RuntimeException("No Customer For " + driverId + " ..!");
        }
    }

    @Override
    public List<DriverDto> getAlldriver() {
        return mapper.map(repo.findAll(), new TypeToken<List<DriverDto>>() {
        }.getType());
    }
}
