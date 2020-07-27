package com.anabneri.pokedex.repository;

import com.anabneri.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository <Pokemon, String>{
}
