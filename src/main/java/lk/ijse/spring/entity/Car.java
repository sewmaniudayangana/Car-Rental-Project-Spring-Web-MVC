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
public class Car {
    @Id
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
