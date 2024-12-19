package com.example.virementservice;

import com.example.virementservice.entities.Virement;
import com.example.virementservice.enums.VirementType;
import com.example.virementservice.feign.BeneficiaryFeignClient;
import com.example.virementservice.models.Beneficiary;
import com.example.virementservice.repositories.VirementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class VirementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirementServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(VirementRepository virementRepository,
                                   BeneficiaryFeignClient beneficiaryFeignClient){
        return args -> {
            List<Beneficiary> beneficiaries = beneficiaryFeignClient.getBeneficiaries();
            beneficiaries.forEach(beneficiary -> {
                virementRepository.save(new Virement(null, beneficiary.getId(), beneficiary.getRib(), 3200+Math.random()*2600, Math.random()<0.5?"achat":"vente", new Date(), Math.random()<0.4?VirementType.INSTANTANE:VirementType.NORMAL, beneficiary));
                System.out.println(beneficiary.toString());
            });
        };
    }

}
