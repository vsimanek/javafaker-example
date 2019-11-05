package cz.vsimanek.examples.javafaker.controller;

import cz.vsimanek.examples.javafaker.dto.PersonDto;
import cz.vsimanek.examples.javafaker.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons/{id}")
    public PersonDto getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }
}
