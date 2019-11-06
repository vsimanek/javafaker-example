package cz.vsimanek.examples.javafaker.service;

import cz.vsimanek.examples.javafaker.dto.NameDto;
import cz.vsimanek.examples.javafaker.dto.QuoteDto;

/**
 * Simple service with some Faker examples.
 */
public interface FakerService {

    /**
     * Method returns random pokemon name.
     *
     * @return random pokemon name.
     */
    NameDto getPokemon();

    /**
     * Method returns random super hero name.
     *
     * @return random super hero name.
     */
    NameDto getSuperHero();

    /**
     * Method returns random quote from Rick and Morty show.
     *
     * @return random quote from Rick and Morty.
     */
    QuoteDto getRickAndMortyQuote();

}
