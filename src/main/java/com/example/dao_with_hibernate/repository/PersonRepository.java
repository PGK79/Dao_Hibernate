package com.example.dao_with_hibernate.repository;

import com.example.dao_with_hibernate.entity.Contact;
import com.example.dao_with_hibernate.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Contact> {
}
