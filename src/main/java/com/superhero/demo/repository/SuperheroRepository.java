package com.superhero.demo.repository;

import com.superhero.demo.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository {
    private List<Superhero> heroes = new ArrayList<>();

    public void addHero(Superhero hero) {
        heroes.add(hero);
    }

    public List<Superhero> getAllHeroes() {
        return heroes;
    }
}
