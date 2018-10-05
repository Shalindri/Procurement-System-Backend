package com.api.procurementsystem.service.supplier;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.Supplier;

// TODO: Auto-generated Javadoc
/**
 * The Interface SupplierService.
 */
@Service
public interface SupplierService {

	/**
	 * Gets the orders by supplier.
	 *
	 * @param supplierId the supplier id
	 * @return the orders by supplier
	 */
	Set<PurchaseOrder> getOrdersBySupplier(Long supplierId);
	
	/**
	 * Adds the supplier.
	 *
	 * @param supplier the supplier
	 */
	void addSupplier(Supplier supplier);
	
	/**
	 * Dispatch order.
	 *
	 * @param purchaseOrder the purchase order
	 * @return the response entity
	 */
	ResponseEntity<Object> dispatchOrder(PurchaseOrder purchaseOrder);
	
	/**
	 * Gets the all suppliers.
	 *
	 * @return the all suppliers
	 */
	List<Supplier> getAllSuppliers();
	
	/**
	 * Evict cache.
	 */
	void evictCache();

	

}
