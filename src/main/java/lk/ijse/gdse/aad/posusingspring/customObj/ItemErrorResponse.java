package lk.ijse.gdse.aad.posusingspring.customObj;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ItemErrorResponse implements ItemResponse{
    private int errorCode;
    private String errorMessage;
}
