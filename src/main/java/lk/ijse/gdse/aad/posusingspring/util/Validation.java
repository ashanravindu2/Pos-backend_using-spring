package lk.ijse.gdse.aad.posusingspring.util;

import lk.ijse.gdse.aad.posusingspring.dto.CustomerDto;
import lk.ijse.gdse.aad.posusingspring.dto.ItemDto;

public class Validation {

    public static String validationCustomer(CustomerDto customerDto){
        if (customerDto.getCustomerId().trim().isEmpty() || !customerDto.getCustomerId().matches("^C.*")){
            return "Invalid";
        }else if (customerDto.getCustomerName().trim().isEmpty() || !customerDto.getCustomerName().matches("[A-Za-z ]+")){
            return "Invalid";
        }else if (customerDto.getCustomerAddress().trim().isEmpty() || !customerDto.getCustomerAddress().matches("[A-Za-z0-9 ,]+")){
            return "Invalid";
        }else if (customerDto.getCustomerSalary() <= 0){
            return "Invalid";
        }else{
            return "Valid";
        }
    }

    public static String validationItem(ItemDto itemDto){
        if (itemDto.getItemCode().trim().isEmpty() || !itemDto.getItemCode().matches("^I.*")){
            return "Invalid";
        }else if (itemDto.getItemName().trim().isEmpty() || !itemDto.getItemName().matches("[A-Za-z ]+")){
            return "Invalid";
        }else if (itemDto.getItemQty() <= 0){
            return "Invalid";
        }else if (itemDto.getItemPrice() <= 0){
            return "Invalid";
        }else{
            return "Valid";
        }
    }

}
