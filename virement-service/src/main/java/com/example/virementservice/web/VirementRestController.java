package com.example.virementservice.web;

import com.example.virementservice.dtos.VirementResponseDTO;
import com.example.virementservice.service.VirementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZAKARIA
 **/
@RestController

public class VirementRestController {

    private VirementService virementService;

    public VirementRestController(VirementService virementService) {
        this.virementService = virementService;
    }

    @GetMapping("/all")
    public List<VirementResponseDTO> getAll(){
        return virementService.getAllVirements();
    }
}
