package ma.enset.beneficiaryservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author ZAKARIA
 **/
@RestController
@RefreshScope
public class BeneficiaryConfigController {
    @Autowired
    private BeneficiaryConfigParams beneficiaryConfigParams;

    @Value("${global.parameter.x}")
    private String x;
    @Value("${global.parameter.y}")
    private String y;


    @GetMapping("/config1")
    public Map<String, String> config1(){
        return Map.of("x", x, "y", y);
    }

    @GetMapping("/config2")
    public BeneficiaryConfigParams config2(){
        return beneficiaryConfigParams;
    }
}
