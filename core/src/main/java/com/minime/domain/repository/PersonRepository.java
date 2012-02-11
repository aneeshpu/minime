package com.minime.domain.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.minime.domain.Person;

public interface PersonRepository extends GraphRepository<Person> {

}
