package lk.ijse.spring.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Customer {
    @Id
    private String cusid;
    private String cusname;
    private String cusaddress;
    private String cusContactno;
    private String cusNIC;
    private String cusemail;
    private String cuspasword;

}
