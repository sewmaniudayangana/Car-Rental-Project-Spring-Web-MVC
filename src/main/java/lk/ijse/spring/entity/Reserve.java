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
public class Reserve {
    @Id
    private String Rid;
    private String Pdate;
    private String Ptime;
    private String Redate;
    private String Retime;
    private String drivertype;

}
