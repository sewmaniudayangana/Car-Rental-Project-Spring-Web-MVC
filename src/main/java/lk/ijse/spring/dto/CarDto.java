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
    private String Cid;
    private String Ccolor;
    private String Ctype;
    private String Cregno;
    private String Cfutype;
    private String Cbrand;
    private String Cnopasenger;
    private String Cavailableonot;
    private String Cprice;
    private String Cextrakmfee;
    private String Cdailyrate;
    private String Cmonthlyrate;
}
