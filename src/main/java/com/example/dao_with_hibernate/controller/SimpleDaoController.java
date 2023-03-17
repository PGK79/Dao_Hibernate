package com.example.dao_with_hibernate.controller;

import com.example.dao_with_hibernate.entity.Person;
import com.example.dao_with_hibernate.repository.SimpleDaoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleDaoController {
    private final SimpleDaoRepository simpleDaoRepository;

    public SimpleDaoController(SimpleDaoRepository simpleDaoRepository) {
        this.simpleDaoRepository = simpleDaoRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam("city") String city) {
        return simpleDaoRepository.getPersonByCity(city);
    }
}