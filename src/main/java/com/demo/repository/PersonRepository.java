package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Person;

public interface PersonRepository extends MongoRepository<Person, String> {

    // Custom queries can be added here if needed
    
}
