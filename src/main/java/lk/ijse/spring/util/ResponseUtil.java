package lk.ijse.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseUtil {
    /*This is a 404 Validation path*/
    private int code;
    private String message;
    private Object data;
}
