package cz.vsimanek.examples.javafaker;

import cz.vsimanek.examples.javafaker.dto.PersonDto;
import cz.vsimanek.examples.javafaker.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class JavafakerApplicationTests {

    @Autowired
    private PersonService personService;

    @Test
    void contextLoads() {
    }

    @Test
    void getPersonServiceTest() {
        PersonDto personDto = personService.getPerson(1L);

        assertThat(personDto.getId()).isEqualTo(1L);
        assertThat(personDto.getLastName()).isEqualTo("Adamos");
        assertThat(personDto.getEmail()).isEqualTo("adamos@mail.cz");
    }

}
