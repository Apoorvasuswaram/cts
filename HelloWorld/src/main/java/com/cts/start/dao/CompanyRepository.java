package com.cts.start.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.start.pojo.Company;
public interface CompanyRepository extends CrudRepository<Company, String> {

	

}