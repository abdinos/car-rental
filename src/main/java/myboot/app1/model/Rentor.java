package myboot.app1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rentor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column
    String firstName;

    @Basic
    @Column
    String lastName;

    @Basic
    @Column
    String adress;

    @Basic
    @Column
    int posCode;

    @Basic
    @Column
    String email;

}
