package io.schuberty.dio.personaapi.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.schuberty.dio.personaapi.utils.PersonUtils.createFakeDTO;
import static io.schuberty.dio.personaapi.utils.PersonUtils.createFakeEntity;

import io.schuberty.dio.personaapi.model.persona.Person;
import io.schuberty.dio.personaapi.system.dto.request.PersonDTO;
import io.schuberty.dio.personaapi.system.dto.response.MessageResponseDTO;
import io.schuberty.dio.personaapi.system.mapper.PersonMapper;
import io.schuberty.dio.personaapi.system.repository.PersonRepository;
import io.schuberty.dio.personaapi.system.service.PersonService;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private PersonService personService;

    @Test
    public void shouldCreateThenReturnSuccessMessage() {
        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        lenient().when(this.personMapper.toModel(personDTO)).thenReturn(expectedSavedPerson);
        lenient().when(this.personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSavedPerson.getId());
        MessageResponseDTO successMessage = this.personService.create(personDTO);

        assertEquals(expectedSuccessMessage.getMessage(), successMessage.getMessage());
    }


    private MessageResponseDTO createExpectedSuccessMessage(Long id) {
        return MessageResponseDTO
            .builder()
            .message("Created person with ID " + id)
            .build();
    }

}