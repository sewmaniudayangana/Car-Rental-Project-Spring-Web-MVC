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

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateVehicle(@RequestBody CarDto Car) {
        carService.updateVehicle(Car);
        return new ResponseUtil(200,"updated",null);
    }

    @DeleteMapping(params = {"cid"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil DeleteVehicle(@RequestParam String id){
        carService.DeleteVehicle(id);
        return new ResponseUtil(200, "Deleted",null);
    }

    @GetMapping(path ="/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchVehicle(@PathVariable String id) {
        return new ResponseUtil(200,"ok",carService.searchVehicle(id));
    }
}
