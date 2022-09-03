package com.example.homework12_3.service.impl;

import com.example.homework12_3.model.Person;
import com.example.homework12_3.repository.PersonRepository;
import com.example.homework12_3.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return personRepository.getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public Person getPersonById(Integer id) {
        return personRepository.findPersonById(id);
    }
}