package com.api.procurementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.procurementsystem.entity.Catalogue;


/**
 * The Interface CatalogueRepository.
 */
@Repository
public interface CatalogueRepository extends CrudRepository<Catalogue, Long> {

}
