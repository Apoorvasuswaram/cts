package com.cts.start.stockprice.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.start.stockprice.pojo.StockPrice;

public interface StockPriceRepository extends CrudRepository<StockPrice,String> {
	Iterable<StockPrice> findAll();

	List<StockPrice> findByCompanyname(String companyname);

}
