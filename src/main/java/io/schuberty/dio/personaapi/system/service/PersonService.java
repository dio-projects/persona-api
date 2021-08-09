package io.schuberty.dio.personaapi.system.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.schuberty.dio.personaapi.exception.PersonNotFoundException;
import io.schuberty.dio.personaapi.model.persona.Person;
import io.schuberty.dio.personaapi.system.dto.request.PersonDTO;
import io.schuberty.dio.personaapi.system.dto.response.MessageResponseDTO;
import io.schuberty.dio.personaapi.system.mapper.PersonMapper;
import io.schuberty.dio.personaapi.system.repository.PersonRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person person = this.personMapper.toModel(personDTO);
        Person createdPerson = this.personRepository.save(person);
        return createMessageResponse("Created person with ID " + createdPerson.getId());
    }

    public List<PersonDTO> listAll() {
        List<Person> persons = this.personRepository.findAll();
        return persons.stream()
            .map(this.personMapper::toDTO)
            .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);
        return personMapper.toDTO(person);
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return this.personRepository.findById(id)
            .orElseThrow(() -> new PersonNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(String message) {
        return MessageResponseDTO
            .builder()
            .message(message)
            .build();
    }
}