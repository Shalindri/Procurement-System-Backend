package com.api.procurementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.procurementsystem.entity.Invoice;

/**
 * The Interface InvoiceRepository.
 */
@Repository
public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
	
	

}
