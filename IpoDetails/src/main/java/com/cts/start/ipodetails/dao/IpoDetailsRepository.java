package com.cts.start.ipodetails.dao;



import org.springframework.data.repository.CrudRepository;

import com.cts.start.ipodetails.pojo.IpoDetails;

public interface IpoDetailsRepository extends CrudRepository<IpoDetails, Integer> {

	Iterable<IpoDetails> findAll();


}
