package com.example.virementservice.dtos;

import com.example.virementservice.enums.VirementType;
import com.example.virementservice.models.Beneficiary;

import java.util.Date;

/**
 * @author ZAKARIA
 **/

public class VirementResponseDTO {

    private Long id;
    private long beneficiaryId;
    private String sourceRib;
    private double balance;
    private String description;
    private Date virementDate;
    private VirementType virementType;
    private Beneficiary beneficiary;

    public VirementResponseDTO() {
    }

    public VirementResponseDTO(Long id, long beneficiaryId, String sourceRib, double balance, String description, Date virementDate, VirementType virementType, Beneficiary beneficiaryResponseDTO) {
        this.id = id;
        this.beneficiaryId = beneficiaryId;
        this.sourceRib = sourceRib;
        this.balance = balance;
        this.description = description;
        this.virementDate = virementDate;
        this.virementType = virementType;
        this.beneficiary = beneficiary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
