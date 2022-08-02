package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarDto {
    private String cid;
    private String ctype;
    private String cbrand;
    private int cpassanger;
    private String cfualtype;
    private String ctransmissiontype;
}
