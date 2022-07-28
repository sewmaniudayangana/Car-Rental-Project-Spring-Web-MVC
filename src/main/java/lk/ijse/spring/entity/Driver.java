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
public class Driver {
    @Id
    private String Did;
    private String Dname;
    private String Daddress;
    private String Dcontact;
    private String DNIC;
    private String Dlicenceno;
    private String password;
}
