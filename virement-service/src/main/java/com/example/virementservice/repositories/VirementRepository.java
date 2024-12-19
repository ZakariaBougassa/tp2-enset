package com.example.virementservice.repositories;

import com.example.virementservice.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ZAKARIA
 **/
public interface VirementRepository extends JpaRepository<Virement, Long> {

}
