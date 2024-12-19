package com.example.virementservice.entities;

import com.example.virementservice.enums.VirementType;
import com.example.virementservice.models.Beneficiary;
import jakarta.persistence.*;

import java.util.Date;

/**
 * @author ZAKARIA
 **/
@Entity
public class Virement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long virementId;
    private long beneficiaryId;
    private String sourceRib;
    private double balance;
    private String description;
    private Date virementDate;
    @Enumerated(EnumType.STRING)
    private VirementType virementType;
    @Transient
    private Beneficiary beneficiary;

    public Virement() {
    }

    public Virement(Long virementId, long beneficiaryId, String sourceRib, double balance, String description, Date virementDate, VirementType virementType, Beneficiary beneficiaryResponseDTO) {
        this.virementId = virementId;
        this.beneficiaryId = beneficiaryId;
        this.sourceRib = sourceRib;
        this.balance = balance;
        this.description = description;
        this.virementDate = virementDate;
        this.virementType = virementType;
        this.beneficiary = beneficiary;
    }

    public Long getVirementId() {
        return virementId;
    }

    public void setVirementId(Long virementId) {
        this.virementId = virementId;
    }

    public long getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(long beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getSourceRib() {
        return sourceRib;
    }

    public void setSourceRib(String sourceRib) {
        this.sourceRib = sourceRib;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getVirementDate() {
        return virementDate;
    }

    public void setVirementDate(Date virementDate) {
        this.virementDate = virementDate;
    }

    public VirementType getVirementType() {
        return virementType;
    }

    public void setVirementType(VirementType virementType) {
        this.virementType = virementType;
    }

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }
}
