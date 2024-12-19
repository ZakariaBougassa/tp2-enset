package ma.enset.beneficiaryservice.web;

import ma.enset.beneficiaryservice.dtos.BeneficiaryRequestDTO;
import ma.enset.beneficiaryservice.dtos.BeneficiaryResponseDTO;
import ma.enset.beneficiaryservice.service.BeneficiaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZAKARIA
 **/
@RestController
@RequestMapping("/api")
public class BeneficiaryController {
    private BeneficiaryService beneficiaryService;

    public BeneficiaryController(BeneficiaryService beneficiaryService) {
        this.beneficiaryService = beneficiaryService;
    }

    @GetMapping("/all")
    public List<BeneficiaryResponseDTO> getAll(){
        return beneficiaryService.getAllBeneficiary();
    }

    @GetMapping("/all/{id}")
    public BeneficiaryResponseDTO getOne(@PathVariable long id){
        return beneficiaryService.getBeneficiary(id);
    }
    @PostMapping("/all")
    public BeneficiaryResponseDTO addOne(@RequestBody BeneficiaryRequestDTO beneficiaryRequestDTO){
        return beneficiaryService.addBeneficiary(beneficiaryRequestDTO);
    }
}
