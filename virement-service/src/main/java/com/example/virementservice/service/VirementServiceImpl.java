package com.example.virementservice.service;

import com.example.virementservice.dtos.VirementRequestDTO;
import com.example.virementservice.dtos.VirementResponseDTO;
import com.example.virementservice.entities.Virement;
import com.example.virementservice.feign.BeneficiaryFeignClient;
import com.example.virementservice.repositories.VirementRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZAKARIA
 **/
@Service
public class VirementServiceImpl implements VirementService {
    private VirementRepository virementRepository;
    private BeneficiaryFeignClient beneficiaryFeignClient;

    public VirementServiceImpl(VirementRepository virementRepository, BeneficiaryFeignClient beneficiaryFeignClient) {
        this.virementRepository = virementRepository;
        this.beneficiaryFeignClient = beneficiaryFeignClient;
    }

    @Override
    public List<VirementResponseDTO> getAllVirements() {

        List<Virement> virementList = virementRepository.findAll();
        List<VirementResponseDTO> virementResponseDTOList = new ArrayList<>();
        virementList.forEach(virement -> {
            VirementResponseDTO virementResponseDTO = new VirementResponseDTO();
            virementResponseDTO.setId(virement.getVirementId());
            virementResponseDTO.setVirementType(virement.getVirementType());
            virementResponseDTO.setVirementDate(virement.getVirementDate());
            virementResponseDTO.setBalance(virement.getBalance());
            virementResponseDTO.setDescription(virement.getDescription());
            virementResponseDTO.setSourceRib(virement.getSourceRib());
            virementResponseDTO.setBeneficiaryId(virement.getBeneficiaryId());

            virementResponseDTOList.add(virementResponseDTO);
        });
        return virementResponseDTOList;
    }

    @Override
    public VirementResponseDTO getOneVirement(Long id) {
        return null;
    }

    @Override
    public VirementResponseDTO sendVirement(VirementRequestDTO virementRequestDTO) {
        return null;
    }
}
