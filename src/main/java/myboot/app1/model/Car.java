package myboot.app1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column
    String model;

    @Basic
    @Column
    String brand;

    @Basic
    @Column
    String productionYear;

    @Basic
    @Column
    CarType carType;

    @Basic
    @Column
    int horsePower;

    @Basic
    @Column
    double price;

    @Basic
    @Column
    double consumption;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    Owner owner;




}
