package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverDto {
    private String did;
    private String dname;
    private String daddress;
    private String dcontact;
    private String dNIC;
    private String dlicenceno;
    private String password;
}
