package com.api.procurementsystem.service.supplier;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.Supplier;

@Service
public interface SupplierService {

	Set<PurchaseOrder> getOrdersBySupplier(Long supplierId);
	void addSupplier(Supplier supplier);
	ResponseEntity<Object> dispatchOrder(PurchaseOrder purchaseOrder);
	List<Supplier> getAllSuppliers();

	

}
