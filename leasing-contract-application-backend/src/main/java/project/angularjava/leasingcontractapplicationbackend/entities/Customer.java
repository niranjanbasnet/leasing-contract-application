package project.angularjava.leasingcontractapplicationbackend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Customer extends Base{
    @Getter @Setter private String firstname;
    @Getter @Setter private String lastname;
    @Getter @Setter private Date birthdate;
    @Getter @Setter public List<LeasingContract> leasingContractList;
}
