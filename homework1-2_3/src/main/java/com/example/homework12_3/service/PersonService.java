package com.example.homework12_3.service;

import com.example.homework12_3.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();

    Person getPersonById(Integer id);
}