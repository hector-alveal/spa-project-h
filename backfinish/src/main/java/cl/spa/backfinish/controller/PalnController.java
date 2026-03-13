/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.spa.backfinish.controller;


import cl.spa.backfinish.model.Plan;
import cl.spa.backfinish.repository.PalnRepository;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Duoc
 */
@RestController
@RequestMapping("/api/planes")
@CrossOrigin("*")
public class PalnController {
    
    private final PalnRepository repository;

    public PalnController(PalnRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public List<Plan> getPlanes(){
        return repository.findAll();
    }
    
}
