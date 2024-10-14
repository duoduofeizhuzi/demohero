package com.superhero.demo.service;

import com.superhero.demo.model.Superhero;
import com.superhero.demo.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    @Autowired
    private SuperheroRepository repository;

    public void addHero(Superhero hero) {
        repository.addHero(hero);
    }

    public List<Superhero> getAllHeroes() {
        return repository.getAllHeroes();
    }
}
