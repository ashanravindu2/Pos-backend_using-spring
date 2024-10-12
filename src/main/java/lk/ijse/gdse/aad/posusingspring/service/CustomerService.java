package lk.ijse.gdse.aad.posusingspring.service;


import lk.ijse.gdse.aad.posusingspring.customObj.CustomerResponse;
import lk.ijse.gdse.aad.posusingspring.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    public void saveCustomer(CustomerDto customerDto);
    public CustomerResponse getCustomer(String customerId);
    public List<CustomerDto> getAllCustomers();
    public void updateCustomer(String customerId, CustomerDto customerDto);
    public void deleteCustomer(String customerId);
}
