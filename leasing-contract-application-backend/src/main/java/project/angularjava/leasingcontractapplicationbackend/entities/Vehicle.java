package project.angularjava.leasingcontractapplicationbackend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class Vehicle extends Base{
    @Getter @Setter private String brand;
    @Getter @Setter private String model;
    @Getter @Setter private String modelyear;
    @Getter @Setter private String vehicleId;
    @Getter @Setter private Integer price;
}
