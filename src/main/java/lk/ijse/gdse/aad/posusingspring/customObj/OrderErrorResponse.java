package lk.ijse.gdse.aad.posusingspring.customObj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderErrorResponse implements OrderResponse {
    private int errorCode;
    private String errorMessage;
}
