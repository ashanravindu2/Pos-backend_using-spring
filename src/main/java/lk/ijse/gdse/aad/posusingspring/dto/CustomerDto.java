package lk.ijse.gdse.aad.posusingspring.dto;


import lk.ijse.gdse.aad.posusingspring.customObj.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDto implements SuperDto, CustomerResponse {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private double customerSalary;
}
