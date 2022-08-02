package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDto;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("driver")
@CrossOrigin
public class DriverController {
    @Autowired
    DriverService driverService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAlldriver() {
        return new ResponseUtil(200,"Ok",driverService.getAlldriver());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil driverSave(@ModelAttribute DriverDto driverDTO) {
        driverService.driverSave(driverDTO);
        return new ResponseUtil(200, "Save", null);
    }
    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deletedriver(@RequestParam String id) {
        driverService.deletedriver(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil serachdriver(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",driverService.serachdriver(id));
    }
}
