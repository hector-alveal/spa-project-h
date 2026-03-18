/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.spa.backfinish.repository;

import cl.spa.backfinish.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Duoc
 */
public interface PalnRepository extends JpaRepository<Plan, Long>{
    
}
