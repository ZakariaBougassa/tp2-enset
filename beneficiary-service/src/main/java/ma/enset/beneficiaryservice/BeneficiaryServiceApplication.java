package ma.enset.beneficiaryservice;

import ma.enset.beneficiaryservice.config.BeneficiaryConfigController;
import ma.enset.beneficiaryservice.config.BeneficiaryConfigParams;
import ma.enset.beneficiaryservice.entities.Beneficiary;
import ma.enset.beneficiaryservice.enums.BeneficiaryType;
import ma.enset.beneficiaryservice.repositories.BeneficiaryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
@EnableConfigurationProperties(BeneficiaryConfigParams.class)
public class BeneficiaryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeneficiaryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(BeneficiaryRepository beneficiaryRepository){

        return args -> {
          beneficiaryRepository.save(new Beneficiary(null, "ahmed", "ahmed", UUID.randomUUID().toString(), BeneficiaryType.MORALE));
          beneficiaryRepository.save(new Beneficiary(null, "abc", "abc", UUID.randomUUID().toString(), BeneficiaryType.MORALE));
          beneficiaryRepository.save(new Beneficiary(null, "ahmed", "ahmed", UUID.randomUUID().toString(), BeneficiaryType.PHYSIQUE));
          beneficiaryRepository.save(new Beneficiary(null, "xyz", "xyz",UUID.randomUUID().toString(), BeneficiaryType.PHYSIQUE));

        };
    }

}
