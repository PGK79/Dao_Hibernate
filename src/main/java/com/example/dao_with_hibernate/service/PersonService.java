package com.example.dao_with_hibernate.service;

import com.example.dao_with_hibernate.entity.Person;
import com.example.dao_with_hibernate.repository.PersonRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(@Autowired PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonFromCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonByAge(int age) {
        return personRepository.findByContact_AgeIsLessThan(age, Sort.by(Sort.Direction.ASC, "Contact_age"));
    }

    public Person getPersonByFullName(String name, String surname) {
        Optional<Person> personWithFullName = personRepository.findByContact_NameAndContact_Surname(name, surname);
        return personWithFullName.orElse(null);
    }
}
