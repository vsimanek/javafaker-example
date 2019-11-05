package cz.vsimanek.examples.javafaker.controller;

import cz.vsimanek.examples.javafaker.dto.PersonDto;
import cz.vsimanek.examples.javafaker.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/persons")
    public PersonDto createPerson() {
        return personService.createPerson();
    }

    @PostMapping("/persons/{id}")
    public PersonDto createPerson(@PathVariable Long id) {
        return personService.createPersonWithId(id);
    }

    @GetMapping("/persons/{id}")
    public PersonDto getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @GetMapping("/persons")
    public List<PersonDto> listPersons() {
        return personService.listPersons();
    }
}
