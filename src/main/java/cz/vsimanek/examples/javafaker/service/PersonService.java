package cz.vsimanek.examples.javafaker.service;

import cz.vsimanek.examples.javafaker.dto.PersonDto;

import java.util.List;

public interface PersonService {

    PersonDto createPerson();

    PersonDto createPersonWithId(Long id);

    PersonDto getPerson(Long id);

    List<PersonDto> listPersons();

    void clearPersons();

}
