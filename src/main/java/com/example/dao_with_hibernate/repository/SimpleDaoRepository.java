package com.example.dao_with_hibernate.repository;

import com.example.dao_with_hibernate.entity.Person;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Builder
public class SimpleDaoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public SimpleDaoRepository(@Autowired EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Person> getPersonByCity(String city) {
        var responseToRequest = entityManager.createNativeQuery("select * from tables_for_task_one.PERSON "
                + "where city_of_living = :city");
        responseToRequest.setParameter("city", city);
        return responseToRequest.getResultList();
    }
}