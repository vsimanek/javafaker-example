package cz.vsimanek.examples.javafaker.controller;

import cz.vsimanek.examples.javafaker.dto.NameDto;
import cz.vsimanek.examples.javafaker.dto.QuoteDto;
import cz.vsimanek.examples.javafaker.service.FakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple controller for some JavaFaker cool methods.
 */
@RestController
public class FakerController {

    @Autowired
    private FakerService fakerService;

    /**
     * @return random name of pokemon.
     */
    @GetMapping("/fakers/names/pokemons")
    public NameDto getPokemon() {
        return fakerService.getPokemon();
    }

    /**
     * @return random name of super hero.
     */
    @GetMapping("/fakers/names/superheroes")
    public NameDto getSuperHero() {
        return fakerService.getSuperHero();
    }

    /**
     * @return random quote from Rick and Morty show.
     */
    @GetMapping("/fakers/quotes/rickandmortys")
    public QuoteDto getRickAndMortyQuote() {
        return fakerService.getRickAndMortyQuote();
    }

}
