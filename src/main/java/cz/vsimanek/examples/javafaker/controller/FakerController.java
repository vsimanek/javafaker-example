package cz.vsimanek.examples.javafaker.controller;

import cz.vsimanek.examples.javafaker.dto.NameDto;
import cz.vsimanek.examples.javafaker.dto.QuoteDto;
import cz.vsimanek.examples.javafaker.service.FakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakerController {

    @Autowired
    private FakerService fakerService;

    @GetMapping("/fakers/names/pokemons")
    public NameDto getPokemon() {
       return fakerService.getPokemon();
    }

    @GetMapping("/fakers/names/superheroes")
    public NameDto getSuperHero() {
        return fakerService.getSuperHero();
    }

    @GetMapping("/fakers/quotes/rickandmortys")
    public QuoteDto getRickAndMortyQuote() {
        return fakerService.getRickAndMortyQuote();
    }

}
