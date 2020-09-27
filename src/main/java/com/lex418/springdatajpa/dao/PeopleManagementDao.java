package com.lex418.springdatajpa.dao;

import com.lex418.springdatajpa.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PeopleManagementDao extends CrudRepository<Person,Integer> {
    Person findByLastName(String lastName);
}
