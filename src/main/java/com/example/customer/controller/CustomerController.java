package com.example.customer.controller;


import com.example.customer.model.Customer;
import com.example.customer.responseHandler.ResponseHandler;
import com.example.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<Object> registerCustomer(@RequestBody Customer customer){
        try{
            customerService.createCustomer(customer);
            return ResponseHandler.handleResponse("Successfully created category", HttpStatus.CREATED,customer);

        }catch(Exception e){
            return ResponseHandler.handleResponse("ERROR", HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }
}
