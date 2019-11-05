package cz.vsimanek.examples.javafaker.service;

import cz.vsimanek.examples.javafaker.dto.PersonDto;

public interface PersonService {

    PersonDto getPerson(Long id);
}
