package rentACar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("individualUser")
@Table(name = "individualUser")
public class IndividualUser extends User {
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
}
