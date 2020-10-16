package com.akcode.currencyexchange.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.akcode.currencyexchange.model.CurrExchange;

public interface CurrExRepo extends MongoRepository<CurrExchange, Integer> {

	List<CurrExchange> findAll();

}
