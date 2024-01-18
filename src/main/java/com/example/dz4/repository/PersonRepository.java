package com.example.dz4.repository;

import com.example.dz4.entity.Person;
import com.example.dz4.entity.PersonId;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, PersonId> {
    List<Person> getPersonsByCity(String city);
}
