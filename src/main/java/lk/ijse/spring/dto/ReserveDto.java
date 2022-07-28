package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReserveDto {
    private String Rid;
    private String Pdate;
    private String Ptime;
    private String Redate;
    private String Retime;
    private String drivertype;
}
