package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDto {
    private String cusid;
    private String cusname;
    private String cusaddress;
    private String cusContactno;
    private String cusNIC;
    private String cusemail;
    private String cuspasword;
}
