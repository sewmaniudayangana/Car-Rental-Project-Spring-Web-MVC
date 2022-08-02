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
    private String did;
    private String dname;
    private String daddress;
    private String dcontact;
    private String dNIC;
    private String dlicenceno;
    private String password;
}
