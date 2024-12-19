package ma.enset.beneficiaryservice.dtos;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ma.enset.beneficiaryservice.enums.BeneficiaryType;

/**
 * @author ZAKARIA
 **/

public class BeneficiaryRequestDTO {

    private String nom;
    private String prenom;
    private BeneficiaryType beneficiaryType;

    public BeneficiaryRequestDTO(String nom, String prenom, BeneficiaryType beneficiaryType) {
        this.nom = nom;
        this.prenom = prenom;
        this.beneficiaryType = beneficiaryType;
    }

    public BeneficiaryRequestDTO() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public BeneficiaryType getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(BeneficiaryType beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }
}
