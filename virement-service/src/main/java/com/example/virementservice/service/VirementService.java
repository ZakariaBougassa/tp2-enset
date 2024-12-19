package com.example.virementservice.service;

import com.example.virementservice.dtos.VirementRequestDTO;
import com.example.virementservice.dtos.VirementResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZAKARIA
 **/
@Service
public interface VirementService {

    public List<VirementResponseDTO> getAllVirements();
    VirementResponseDTO getOneVirement(Long id);
    VirementResponseDTO sendVirement(VirementRequestDTO virementRequestDTO);


}
