package project.angularjava.leasingcontractapplicationbackend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Base {
    @Id
    @Column(name = "uuid", nullable = false)
    @Getter @Setter private UUID uuid;
}
