package com.example.homework12_3.repository;

import com.example.homework12_3.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;

@Repository
public class PersonRepository {
    private List<Person> listPerson;

    @PostConstruct
    public void dataPerson(){
        listPerson = new ArrayList<>();
        listPerson.add(new Person(1, "Smith", 20, Arrays.asList("Football", "Swimming")));
        listPerson.add(new Person(6, "Johnson", 27, Arrays.asList("Biking", "Billiards")));
        listPerson.add(new Person(3, "Williams", 14, Arrays.asList("Magic", "Chess Playing")));
        listPerson.add(new Person(2, "Brown", 29, Arrays.asList("Martial Arts", "Painting")));
        listPerson.add(new Person(4, "Jones", 45, Arrays.asList("Camping", "Rapping")));
        listPerson.add(new Person(5, "Walker", 17, Arrays.asList("Birding", "Gym", "Cooking")));
    }

    public List<Person> getAllPersons(){
        return listPerson;
    }

    public Person findPersonById(Integer id){
        Person person = null;
        for (Person p : listPerson ){
            if (p.getId()==id)
                person =p;
        }
        return person;
    }
}
