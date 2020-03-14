package com.cts.start.sector.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.start.sector.pojo.Sectors;

public interface SectorsRepository extends CrudRepository<Sectors, Integer> {

	Iterable<Sectors> findAll();

}