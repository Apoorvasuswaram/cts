package com.cts.start.dao;
import com.cts.start.pojo.StockPrice;
import org.springframework.data.repository.CrudRepository;

public interface StockPriceRepository extends CrudRepository<StockPrice,String> {
	Iterable<StockPrice> findAll();

}
