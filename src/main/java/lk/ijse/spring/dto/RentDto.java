package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RentDto {
    private String Reid;
    private double Repayment;
    private double Refee;
    private double Dfee;
    private double Dextrakmfee;
    private double Redamagepayment;
}
