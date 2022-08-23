package com.example.personsrest.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    // Fetching persons, by using the findAll() method in personRepository
    private PersonRepository personRepository;

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }
}
