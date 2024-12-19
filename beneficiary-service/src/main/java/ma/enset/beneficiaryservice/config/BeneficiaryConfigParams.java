package ma.enset.beneficiaryservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ZAKARIA
 **/
@ConfigurationProperties(prefix = "beneficiary.parameter")
public record BeneficiaryConfigParams(int a, int b) {
}
