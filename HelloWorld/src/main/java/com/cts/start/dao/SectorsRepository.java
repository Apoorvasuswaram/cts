package com.cts.start.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.start.pojo.Sectors;

public interface SectorsRepository extends CrudRepository<Sectors, Integer> {

	Iterable<Sectors> findAll();

}