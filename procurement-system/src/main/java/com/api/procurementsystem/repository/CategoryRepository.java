package com.api.procurementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.procurementsystem.entity.Category;

/**
 * The Interface CategoryRepository.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
