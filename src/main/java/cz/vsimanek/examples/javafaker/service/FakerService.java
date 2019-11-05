package cz.vsimanek.examples.javafaker.service;

import cz.vsimanek.examples.javafaker.dto.NameDto;
import cz.vsimanek.examples.javafaker.dto.QuoteDto;

public interface FakerService {

    NameDto getPokemon();

    NameDto getSuperHero();

    QuoteDto getRickAndMortyQuote();

}
