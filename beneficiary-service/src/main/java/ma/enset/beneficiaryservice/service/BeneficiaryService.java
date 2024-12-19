package ma.enset.beneficiaryservice.service;

import ma.enset.beneficiaryservice.dtos.BeneficiaryRequestDTO;
import ma.enset.beneficiaryservice.dtos.BeneficiaryResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZAKARIA
 **/
@Service
public interface BeneficiaryService {
    List<BeneficiaryResponseDTO> getAllBeneficiary();
    BeneficiaryResponseDTO getBeneficiary(long id);
    BeneficiaryResponseDTO addBeneficiary(BeneficiaryRequestDTO beneficiaryRequestDTO);
}
