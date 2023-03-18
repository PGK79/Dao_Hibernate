package com.example.dao_with_hibernate.service;

import com.example.dao_with_hibernate.entity.Person;
import com.example.dao_with_hibernate.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(@Autowired PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonFromCity(String cityOfLiving){
    //Sort sort = Sort.by ("city_of_living");
   // List<Person> personList = personRepository.findByCityOfLiving(cityOfLiving);
       // System.out.println("РЕЗУЛЬТАТ" + personRepository.count());
var result = personRepository.count();
        System.out.println("РЕЗУЛЬТАТ = " + result);
    return new ArrayList<>();
    }
}
