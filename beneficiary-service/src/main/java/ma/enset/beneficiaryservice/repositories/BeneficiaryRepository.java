package ma.enset.beneficiaryservice.repositories;

import ma.enset.beneficiaryservice.entities.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ZAKARIA
 **/
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
