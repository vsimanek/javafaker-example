package cz.vsimanek.examples.javafaker.service;

import cz.vsimanek.examples.javafaker.dto.PersonDto;

import java.util.List;

/**
 * Service handling work with Person object and its data.
 */
public interface PersonService {

    /**
     * Method for creating Person object. In this method person ID is created via Faker method for generating
     * random long number. And all other attributes are generated via Faker as well.
     *
     * @return created Person object.
     */
    PersonDto createPerson();

    /**
     * Method for creating Person object with given ID. User can choose what ID object will have. All other
     * attributes are generated via Faker.
     *
     * @param id ID that object Person will have.
     * @return created Person object.
     */
    PersonDto createPersonWithId(Long id);

    /**
     * Method returns Person object by given ID.
     *
     * @param id of Person object user wants to get.
     * @return Person object that user wants.
     */
    PersonDto getPerson(Long id);

    /**
     * Method returns all created Persons.
     *
     * @return all Person objects.
     */
    List<PersonDto> listPersons();

    /**
     * Method clears list of Person objects.
     */
    void clearPersons();

}
