package io.schuberty.dio.personaapi.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static io.schuberty.dio.personaapi.utils.PersonUtils.createFakeDTO;
import static io.schuberty.dio.personaapi.utils.PersonUtils.createFakeEntity;

import io.schuberty.dio.personaapi.model.persona.Person;
import io.schuberty.dio.personaapi.model.persona.Phone;
import io.schuberty.dio.personaapi.system.dto.request.PersonDTO;
import io.schuberty.dio.personaapi.system.dto.request.PhoneDTO;
import io.schuberty.dio.personaapi.system.mapper.PersonMapper;

@SpringBootTest
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void shouldCreatePersonDTOThenReturnPersonEntity() {
        PersonDTO personDTO = createFakeDTO();
        Person person = personMapper.toModel(personDTO);

        assertEquals(person.getId(), personDTO.getId());
        assertEquals(person.getFirstName(), personDTO.getFirstName());
        assertEquals(person.getLastName(), personDTO.getLastName());
        assertEquals(person.getCpf(), personDTO.getCpf());

        Phone phone = person.getPhones().get(0);
        PhoneDTO phoneDTO = personDTO.getPhones().get(0);

        assertEquals(phoneDTO.getType(), phone.getType());
        assertEquals(phoneDTO.getNumber(), phone.getNumber());
    }

    @Test
    void testGivenPersonEntityThenReturnPersonDTO() {
        Person person = createFakeEntity();
        PersonDTO personDTO = personMapper.toDTO(person);

        assertEquals(person.getFirstName(), personDTO.getFirstName());
        assertEquals(person.getLastName(), personDTO.getLastName());
        assertEquals(person.getCpf(), personDTO.getCpf());

        Phone phone = person.getPhones().get(0);
        PhoneDTO phoneDTO = personDTO.getPhones().get(0);

        assertEquals(phone.getType(), phoneDTO.getType());
        assertEquals(phone.getNumber(), phoneDTO.getNumber());
    }
}