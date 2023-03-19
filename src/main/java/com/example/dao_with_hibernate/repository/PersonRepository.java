package com.example.dao_with_hibernate.repository;

import com.example.dao_with_hibernate.entity.Contact;
import com.example.dao_with_hibernate.entity.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Contact> {
    List<Person> findByCityOfLiving(String cityOfLiving);

    List<Person> findByContact_AgeIsLessThan(int age, Sort sort);

    Optional<Person> findByContact_NameAndContact_Surname(String name, String surname);
}
