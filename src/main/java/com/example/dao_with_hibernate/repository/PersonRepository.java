package com.example.dao_with_hibernate.repository;

import com.example.dao_with_hibernate.entity.Contact;
import com.example.dao_with_hibernate.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Contact> {

    @Query("select p from Person p where p.cityOfLiving = :city")
    List<Person> findCityOfLiving(@Param("city") String cityOfLiving);

    @Query("select p from Person p where p.contact.age < :age order by p.contact.age")
    List<Person> findContactAgeIsLessThan(@Param("age") int age);

    @Query("select p from Person p where p.contact.name = :name and p.contact.surname = :surname")
    Optional<Person> findContactNameAndContactSurname(@Param("name") String name, @Param("surname") String surname);
}