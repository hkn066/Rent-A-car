package rentACar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="individualUser")
public class IndividualUser extends User {
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
}
