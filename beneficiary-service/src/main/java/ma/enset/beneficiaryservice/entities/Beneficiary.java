package ma.enset.beneficiaryservice.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.enset.beneficiaryservice.enums.BeneficiaryType;

/**
 * @author ZAKARIA
 **/
@Entity

public class Beneficiary {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String rib;
    @Enumerated(EnumType.STRING)
    private BeneficiaryType beneficiaryType;

    public Beneficiary() {
    }

    public Beneficiary(Long id, String nom, String prenom, String rib, BeneficiaryType beneficiaryType) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.rib = rib;
        this.beneficiaryType = beneficiaryType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public BeneficiaryType getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(BeneficiaryType beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }
}
