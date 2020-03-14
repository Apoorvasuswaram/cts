package com.cts.start.stockexchange.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.start.stockexchange.pojo.StockExchange;

public interface StockExchangeRepository extends CrudRepository<StockExchange, Integer> {

	Iterable<StockExchange> findAll();

}