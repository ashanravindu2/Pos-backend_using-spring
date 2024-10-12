package lk.ijse.gdse.aad.posusingspring.controller;


import lk.ijse.gdse.aad.posusingspring.customObj.CustomerResponse;
import lk.ijse.gdse.aad.posusingspring.dto.CustomerDto;
import lk.ijse.gdse.aad.posusingspring.exception.CustomerNotFoundException;
import lk.ijse.gdse.aad.posusingspring.exception.DataPersistFailedException;
import lk.ijse.gdse.aad.posusingspring.service.CustomerService;
import lk.ijse.gdse.aad.posusingspring.util.AppUtil;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private final CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveCustomer(@RequestBody CustomerDto customerDto){
        logger.info("Request to save customer {}", customerDto);
        if (customerDto == null) {
            logger.warn("Received null customerDto for saving");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else {
            try {
                customerDto.setCustomerId(AppUtil.createCusId()) ;
                customerService.saveCustomer(customerDto);
                logger.info("Successfully saved customer: {}", customerDto);
                return new ResponseEntity<>(HttpStatus.CREATED);
            }catch (DataPersistFailedException e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @GetMapping("/{customerId}")
    public CustomerResponse getCustomer(@PathVariable ("customerId") String customerId){
        return customerService.getCustomer(customerId);
    }

    @GetMapping
    public List<CustomerDto> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PatchMapping("/{customerId}")
    public ResponseEntity<Void> updateCustomer(@PathVariable ("customerId") String customerId, @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable ("customerId") String customerId){
        try {
            customerService.deleteCustomer(customerId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (CustomerNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
