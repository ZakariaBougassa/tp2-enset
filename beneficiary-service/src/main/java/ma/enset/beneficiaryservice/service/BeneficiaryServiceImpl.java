package ma.enset.beneficiaryservice.service;

import ma.enset.beneficiaryservice.dtos.BeneficiaryRequestDTO;
import ma.enset.beneficiaryservice.dtos.BeneficiaryResponseDTO;
import ma.enset.beneficiaryservice.entities.Beneficiary;
import ma.enset.beneficiaryservice.repositories.BeneficiaryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZAKARIA
 **/
@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {
    private BeneficiaryRepository beneficiaryRepository;

    public BeneficiaryServiceImpl(BeneficiaryRepository beneficiaryRepository) {
        this.beneficiaryRepository = beneficiaryRepository;
    }

    @Override
    public List<BeneficiaryResponseDTO> getAllBeneficiary() {
        List<Beneficiary> beneficiaries = beneficiaryRepository.findAll();
        List<BeneficiaryResponseDTO> beneficiaryResponseDTOS = new ArrayList<>();
        beneficiaries.forEach(beneficiary -> {
            BeneficiaryResponseDTO beneficiaryResponseDTO = new BeneficiaryResponseDTO();

            beneficiaryResponseDTO.setId(beneficiary.getId());
            beneficiaryResponseDTO.setNom(beneficiary.getNom());
            beneficiaryResponseDTO.setPrenom(beneficiary.getPrenom());
            beneficiaryResponseDTO.setRib(beneficiary.getRib());
            beneficiaryResponseDTO.setBeneficiaryType(beneficiary.getBeneficiaryType());

            beneficiaryResponseDTOS.add(beneficiaryResponseDTO);
        });

        return beneficiaryResponseDTOS;
    }

    @Override
    public BeneficiaryResponseDTO getBeneficiary(long id) {
        Beneficiary beneficiary = beneficiaryRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
        BeneficiaryResponseDTO beneficiaryResponseDTO = new BeneficiaryResponseDTO();
        beneficiaryResponseDTO.setId(beneficiary.getId());
        beneficiaryResponseDTO.setNom(beneficiary.getNom());
        beneficiaryResponseDTO.setPrenom(beneficiary.getPrenom());
        beneficiaryResponseDTO.setRib(beneficiary.getRib());
        beneficiaryResponseDTO.setBeneficiaryType(beneficiary.getBeneficiaryType());

        return beneficiaryResponseDTO;
    }

    @Override
    public BeneficiaryResponseDTO addBeneficiary(BeneficiaryRequestDTO beneficiaryRequestDTO) {

        Beneficiary beneficiary = new Beneficiary();
        beneficiary.setNom(beneficiaryRequestDTO.getNom());
        beneficiary.setPrenom(beneficiaryRequestDTO.getPrenom());
        beneficiary.setBeneficiaryType(beneficiaryRequestDTO.getBeneficiaryType());
        Beneficiary savedBeneficiary = beneficiaryRepository.save(beneficiary);
        BeneficiaryResponseDTO beneficiaryResponseDTO = new BeneficiaryResponseDTO();
        beneficiaryResponseDTO.setId(savedBeneficiary.getId());
        beneficiaryResponseDTO.setNom(savedBeneficiary.getNom());
        beneficiaryResponseDTO.setPrenom(savedBeneficiary.getPrenom());
        beneficiaryResponseDTO.setRib(savedBeneficiary.getRib());
        beneficiaryResponseDTO.setBeneficiaryType(savedBeneficiary.getBeneficiaryType());

        return beneficiaryResponseDTO;
    }
}
