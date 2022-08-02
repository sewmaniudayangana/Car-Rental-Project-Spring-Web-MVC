package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CarDto;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("car")
@CrossOrigin
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicles() { return new ResponseUtil(200,"ok",carService.getAllVehicles()); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil VehicleSave(@ModelAttribute CarDto Car){
        carService.VehicleSave(Car);
        return new ResponseUtil(200,"Save", null);
    }
}
