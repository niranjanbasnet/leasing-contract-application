package project.angularjava.leasingcontractapplicationbackend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LeasingContract extends Base{
    @Getter @Setter private String contractnumber;
    @Getter @Setter private Integer monthlyrate;
    @Getter @Setter
    @OneToOne
    @JoinColumn(name = "vehicle_uuid")
    public Vehicle vehicle;
}
