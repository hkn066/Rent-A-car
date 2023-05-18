package rentACar.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "corporateUser")
public class CorporateUser extends User {
    @Column(name = "companyName")
    private String companyName;

}
