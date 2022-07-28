package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDto;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService customer;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(200,"Ok",customer.getAllCustomer()) ;
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil customerSave(@ModelAttribute CustomerDto customerDTO) {
        System.out.println(customerDTO.toString());
        customer.saveCustomer(customerDTO);
        return new ResponseUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody CustomerDto customerDTO) {
        customer.updateCustomer(customerDTO);
        return new ResponseUtil(200,"Updated",null) ;
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        customer.deleteCustomer(id);
        return new ResponseUtil(200,"Deleted",null) ;
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil serachCustomer(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",customer.searchCustomer(id)) ;
    }
}
