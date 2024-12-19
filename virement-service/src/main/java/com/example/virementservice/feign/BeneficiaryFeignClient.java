package com.example.virementservice.feign;

import com.example.virementservice.models.Beneficiary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author ZAKARIA
 **/
@FeignClient(value = "beneficiary-service")
public interface BeneficiaryFeignClient {

    @GetMapping("api/all/{id}")
    public Beneficiary getBeneficiaryById(@PathVariable Long id);

    @GetMapping("/api/all")
    public List<Beneficiary> getBeneficiaries();
}
