package com.example.virementservice.models;

import lombok.Builder;
import lombok.ToString;

/**
 * @author ZAKARIA
 **/
@Builder
public class Beneficiary {

    private Long id;
    private String nom;
    private String prenom;
    private String rib;

    @Override
    public String toString() {
        return "Beneficiary{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", rib='" + rib + '\'' +
                '}';
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


}
