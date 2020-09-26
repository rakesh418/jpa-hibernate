package com.lex418.springdatajpa.service;

import com.lex418.springdatajpa.dao.PeopleManagementDao;
import com.lex418.springdatajpa.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManagementDao peopleManagementDao;

    public Person creatPerson(Person person1) {
        Person personDb = peopleManagementDao.save(person1);
        return personDb;
    }

    public Iterable<Person> creatPersons(List<Person> personList) {
        Iterable<Person> personDbList = peopleManagementDao.saveAll(personList);
        return personDbList;
    }

}
