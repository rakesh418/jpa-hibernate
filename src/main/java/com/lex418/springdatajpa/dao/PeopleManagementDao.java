package com.lex418.springdatajpa.dao;

import com.lex418.springdatajpa.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManagementDao extends CrudRepository<Person,Integer> {
}
