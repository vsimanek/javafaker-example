package cz.vsimanek.examples.javafaker;

import cz.vsimanek.examples.javafaker.dto.PersonDto;
import cz.vsimanek.examples.javafaker.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class JavafakerApplicationTests {

    @Autowired
    private PersonService personService;

    /**
     * Simple example test for creating person without given ID.
     */
    @Test
    void createPersonServiceTest() {
        personService.createPerson();

        List<PersonDto> persons = personService.listPersons();

        assertThat(persons.size()).isEqualTo(1);
        assertThat(persons.get(0).getLastName()).isNotEmpty();
        assertThat(persons.get(0).getEmail()).isNotEmpty();

        personService.createPerson();

        persons = personService.listPersons();

        assertThat(persons.size()).isEqualTo(2);

        personService.clearPersons();

        persons = personService.listPersons();

        assertThat(persons.size()).isEqualTo(0);
    }

    /**
     * Simple example test for creating person with given ID.
     */
    @Test
    void createPersonWithIdServiceTest() {
        personService.createPersonWithId(1L);

        List<PersonDto> persons = personService.listPersons();

        assertThat(persons.size()).isEqualTo(1);
        assertThat(persons.get(0).getId()).isEqualTo(1L);
        assertThat(persons.get(0).getLastName()).isNotEmpty();
        assertThat(persons.get(0).getEmail()).isNotEmpty();

        personService.createPersonWithId(2L);

        persons = personService.listPersons();

        assertThat(persons.size()).isEqualTo(2);
        assertThat(persons.get(0).getId()).isEqualTo(1L);
        assertThat(persons.get(1).getId()).isEqualTo(2L);

        personService.clearPersons();

        persons = personService.listPersons();

        assertThat(persons.size()).isEqualTo(0);
    }

}
