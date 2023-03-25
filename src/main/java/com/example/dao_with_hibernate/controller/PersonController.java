package com.example.dao_with_hibernate.controller;

import com.example.dao_with_hibernate.entity.Person;
import com.example.dao_with_hibernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(@Autowired PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    @Secured("ROLE_READ")

    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return personService.getPersonFromCity(city);
    }

    @GetMapping("/by-age")
    @RolesAllowed("ROLE_WRITE")
    public List<Person> getPersonsByAge(@RequestParam("age") int age) {
        return personService.getPersonByAge(age);
    }

    @GetMapping("/by-fullname")
    @PreAuthorize("hasAnyRole('ROLE_WRITE', 'ROLE_DELETE')")
    public Person getPersonsByAge(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return personService.getPersonByFullName(name, surname);
    }

    @GetMapping("/by-only-name")
    @PreAuthorize("#name == authentication.principal.username")
    public List<Person> getPersonsByAgeTwo(@RequestParam("name") String name) {
        System.out.println("NAME = " + name);
        return personService.getPersonsByName(name);
    }

    @GetMapping("/by-fullname-two")
    @PostAuthorize("hasAnyRole('ROLE_WRITE', 'ROLE_DELETE')")
    public Person getPersonsByAgeTwo(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return personService.getPersonByFullNameTwo(name, surname);
    }
}