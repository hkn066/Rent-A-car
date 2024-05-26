package rentACar.entities;

import jakarta.persistence.*;

import lombok.*;
import rentACar.entities.enumeration.CarStateEnum;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="packageName")
	private String packageName;
	
	@Column(name="plate",unique = true)
	private String plate;
	
	@Column(name="dailyPrice")
	private double dailyPrice;
	
	@Column(name="modelYear")
	private int modelYear;
	
	 @Enumerated(EnumType.ORDINAL)
	@Column(name="state")
	private CarStateEnum state; // 1- Available 2-rented 3- Maintenance
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;

	@OneToMany(mappedBy = "car")
	private List<Rental> rentals;


	

}
