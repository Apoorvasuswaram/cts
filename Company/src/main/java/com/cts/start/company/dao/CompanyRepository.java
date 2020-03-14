package com.cts.start.company.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.start.company.pojo.Company;
public interface CompanyRepository extends CrudRepository<Company, String> {

	Iterable<Company> findAll();

}
