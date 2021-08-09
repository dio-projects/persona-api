package io.schuberty.dio.personaapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import io.schuberty.dio.personaapi.model.persona.Person;
import io.schuberty.dio.personaapi.system.dto.request.PersonDTO;

public class PersonUtils {
    
    private static final String FIRST_NAME;
    private static final String LAST_NAME;
    private static final String CPF_NUMBER;
    private static final String BIRTH_STRING;
    private static final long PERSON_ID;
    private static final LocalDate BIRTH_DATE;

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
            .firstName(FIRST_NAME)
            .lastName(LAST_NAME)
            .cpf(CPF_NUMBER)
            .birthDate(BIRTH_STRING)
            .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
            .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
            .id(PERSON_ID)
            .firstName(FIRST_NAME)
            .lastName(LAST_NAME)
            .cpf(CPF_NUMBER)
            .birthDate(BIRTH_DATE)
            .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
            .build();
    }

    static {
        FIRST_NAME = "Gabriel";
        LAST_NAME = "Schubert";
        CPF_NUMBER = "94132767817";
        PERSON_ID = 1L;
        BIRTH_DATE = LocalDate.of(1960, 1, 1);
        BIRTH_STRING = "01-01-1960";
    }
}