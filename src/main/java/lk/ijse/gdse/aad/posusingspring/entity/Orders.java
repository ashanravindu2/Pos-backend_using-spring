package lk.ijse.gdse.aad.posusingspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "order")
@Entity
public class Orders implements SuperEntity{
    @Id
    private String orderId;
    @ManyToOne
    @JoinColumn(name = "customer_Id", referencedColumnName = "customerId")
    private Customer customer;
    private LocalDateTime orderTimeDate;
    private double total;


}
