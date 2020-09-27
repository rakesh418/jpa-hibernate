package com.lex418.springdatajpa;

import com.lex418.springdatajpa.entities.Person;
import com.lex418.springdatajpa.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    @Autowired
    private PeopleManagementService peopleManagementService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        createPerson();
        createPersons();
        getPersonById(21);
    }

    private void createPerson(){
        Person person1 = new Person("Seean","Muphy","lex32@gmail.com",new Date());
        Person personDb = peopleManagementService.creatPerson(person1);
        System.out.println(personDb);
    }

    private void createPersons(){
        List<Person>  persons = Arrays.asList(new Person("Seean", "sam", "lex1@gmail.com", new Date()),
                new Person("Lex", "canny", "lex2@gmail.com", new Date()),
                new Person("Luthar", "Muphy", "lex3@gmail.com", new Date()),
                new Person("Murugan", "m", "lex4@gmail.com", new Date()));
        Iterable<Person> personDbs = peopleManagementService.creatPersons(persons);
//        System.out.println(personDb);
    }

    private void getPersonById(int id){
        Person person = peopleManagementService.getPersonbyID(id);
        System.out.println(person);
    }
}
