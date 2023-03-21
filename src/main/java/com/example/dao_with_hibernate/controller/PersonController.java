package com.example.dao_with_hibernate.controller;

import com.example.dao_with_hibernate.entity.Person;
import com.example.dao_with_hibernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(@Autowired PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return personService.getPersonFromCity(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonsByAge(@RequestParam("age") int age) {
        return personService.getPersonByAge(age);
    }

    @GetMapping("/by-fullname")
    public Person getPersonsByAge(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return personService.getPersonByFullName(name, surname);
    }
}