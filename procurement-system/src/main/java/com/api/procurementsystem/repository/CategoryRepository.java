package com.api.procurementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.procurementsystem.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
