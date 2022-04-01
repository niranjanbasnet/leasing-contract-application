package project.angularjava.leasingcontractapplicationbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.angularjava.leasingcontractapplicationbackend.entities.LeasingContract;

import java.util.UUID;

@Repository
public interface LeasingContractRepository extends JpaRepository<LeasingContract, UUID> {
}