package com.example.virementservice.dtos;

import com.example.virementservice.enums.VirementType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

/**
 * @author ZAKARIA
 **/

public class VirementRequestDTO {

    private long beneficiaryId;
    private String sourceRib;
    private double balance;
    private String description;
    private VirementType virementType;

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

    public VirementType getVirementType() {
        return virementType;
    }

    public void setVirementType(VirementType virementType) {
        this.virementType = virementType;
    }

    public VirementRequestDTO() {
    }

    public VirementRequestDTO(long beneficiaryId, String sourceRib, double balance, String description, VirementType virementType) {
        this.beneficiaryId = beneficiaryId;
        this.sourceRib = sourceRib;
        this.balance = balance;
        this.description = description;
        this.virementType = virementType;
    }
}
