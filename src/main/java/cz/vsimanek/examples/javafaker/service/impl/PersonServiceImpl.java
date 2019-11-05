package cz.vsimanek.examples.javafaker.service.impl;

import com.github.javafaker.Faker;
import cz.vsimanek.examples.javafaker.dto.PersonDto;
import cz.vsimanek.examples.javafaker.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.*;

import static cz.vsimanek.examples.javafaker.utils.EmailUtils.*;

@Service
public class PersonServiceImpl implements PersonService {

    private final List<PersonDto> persons = new ArrayList<>();

    @Override
    public PersonDto createPerson() {
        return createPersonDto(null);
    }

    @Override
    public PersonDto createPersonWithId(Long id) throws IllegalArgumentException {
        return createPersonDto(id);
    }

    @Override
    public PersonDto getPerson(Long id) {
        Optional<PersonDto> personDto = persons.stream().filter(it -> it.getId().equals(id)).findFirst();
        if (!personDto.isPresent()) {
            throw new NoSuchElementException();
        } else {
            return personDto.get();
        }
    }

    @Override
    public List<PersonDto> listPersons() {
        return persons;
    }

    @Override
    public void clearPersons() {
        persons.clear();
    }

    private PersonDto createPersonDto(Long id) {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        Long personId;
        if (matchPersonId(id)) {
            throw new IllegalArgumentException();
        } else if (id != null) {
            personId = id;
        } else {
            personId = faker.number().randomNumber();
            while (matchPersonId(personId)) {
                personId = faker.number().randomNumber();
            }
        }

        PersonDto personDto = new PersonDto(personId, firstName, lastName, email(firstName, lastName),
                faker.phoneNumber().cellPhone(), faker.date().birthday(20, 50));
        persons.add(personDto);

        return personDto;
    }

    private boolean matchPersonId(Long personId) {
        return persons.stream().anyMatch(personDto -> personDto.getId().equals(personId));
    }

}
