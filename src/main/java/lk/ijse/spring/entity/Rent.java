package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Rent {
    @Id
    private String Reid;
    private double Repayment;
    private double Refee;
    private double Dfee;
    private double Dextrakmfee;
    private double Redamagepayment;

}
