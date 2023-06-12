package rentACar.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("corporateUser")
@Table(name = "corporateUser")
public class CorporateUser extends User {
    @Column(name = "companyTitle")
    private String companyTitle;

}
