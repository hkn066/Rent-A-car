package rentACar.entities;

import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

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
