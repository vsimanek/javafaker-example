package cz.vsimanek.examples.javafaker.service.impl;

import com.github.javafaker.Faker;
import cz.vsimanek.examples.javafaker.dto.NameDto;
import cz.vsimanek.examples.javafaker.dto.QuoteDto;
import cz.vsimanek.examples.javafaker.service.FakerService;
import org.springframework.stereotype.Service;

@Service
public class FakerServiceImpl implements FakerService {

    @Override
    public NameDto getPokemon() {
        return new NameDto(new Faker().pokemon().name());
    }

    @Override
    public NameDto getSuperHero() {
        return new NameDto(new Faker().superhero().name());
    }

    @Override
    public QuoteDto getRickAndMortyQuote() {
        return new QuoteDto(new Faker().rickAndMorty().quote());
    }
}
