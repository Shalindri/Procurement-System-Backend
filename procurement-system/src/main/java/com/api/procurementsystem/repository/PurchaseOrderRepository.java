package com.api.procurementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.procurementsystem.entity.PurchaseOrder;

@Repository
public interface PurchaseOrderRepository extends CrudRepository< PurchaseOrder , Long >  {

}
