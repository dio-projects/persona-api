package io.schuberty.dio.personaapi.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.schuberty.dio.personaapi.model.persona.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> { }