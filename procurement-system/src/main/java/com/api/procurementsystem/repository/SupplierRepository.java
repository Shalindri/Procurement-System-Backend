package com.api.procurementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.procurementsystem.entity.Supplier;

/**
 * The Interface SupplierRepository.
 */
@Repository
public interface SupplierRepository extends CrudRepository< Supplier , Long > {

}
