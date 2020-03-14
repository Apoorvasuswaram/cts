package com.cts.start.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.start.pojo.StockExchange;

public interface StockExchangeRepository extends CrudRepository<StockExchange, Integer> {

	Iterable<StockExchange> findAll();

}