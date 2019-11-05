package cz.vsimanek.examples.javafaker.service.impl;

import cz.vsimanek.examples.javafaker.dto.PersonDto;
import cz.vsimanek.examples.javafaker.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private List<PersonDto> persons = Collections.singletonList(new PersonDto(1L, "Adam", "Adamos", "adamos@mail.cz", "123456789", new Date()));

    @Override
    public PersonDto getPerson(Long id) {
        System.out.println(id);
        System.out.println(persons.stream().filter(personDto -> personDto.getId().equals(id)).findFirst());
        return persons.stream().filter(personDto -> personDto.getId().equals(id)).findFirst().get();
    }

}
