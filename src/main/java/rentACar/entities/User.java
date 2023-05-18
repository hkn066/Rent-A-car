package rentACar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "Email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @OneToOne(mappedBy = "user")
    private Customer customer;
}
