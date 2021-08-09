package io.schuberty.dio.personaapi.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schuberty.dio.personaapi.model.persona.Person;

public interface PersonRepository extends JpaRepository<Person, Long> { }