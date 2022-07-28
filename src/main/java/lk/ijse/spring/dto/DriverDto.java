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
    private String Did;
    private String Dname;
    private String Daddress;
    private String Dcontact;
    private String DNIC;
    private String Dlicenceno;
    private String password;
}
