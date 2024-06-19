package rentACar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rentals")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "rentDate",nullable = false)
    private String rentDate;
    
    @Column(name = "returnDate" )
    @Nullable
    private String returnDate;

    @ManyToOne()
    @JoinColumn(name = "carId")
    private Car car;

    @ManyToOne()
    @JoinColumn(name = "userId")

    private User user;
}
