package com.api.procurementsystem.service.purchaseOrder;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;

// TODO: Auto-generated Javadoc
/**
 * The Interface PurchaseOrderService.
 */
@Service
public interface PurchaseOrderService {
	
	/**
	 * Creates the purchase order.
	 *
	 * @param purchaseOrder the purchase order
	 */
	void createPurchaseOrder(PurchaseOrder purchaseOrder);
	
	/**
	 * Gets the all purchase orders.
	 *
	 * @return the all purchase orders
	 */
	List<PurchaseOrder> getAllPurchaseOrders();
	
	/**
	 * Approve order.
	 *
	 * @param orderId the order id
	 * @return the response entity
	 */
	ResponseEntity<Object> approveOrder(Long orderId);
	
	/**
	 * Gets the order by id.
	 *
	 * @param id the id
	 * @return the order by id
	 */
	Optional<PurchaseOrder> getOrderById(Long id);
	
	/**
	 * Gets the un approved orders.
	 *
	 * @return the un approved orders
	 */
	List<PurchaseOrder> getUnApprovedOrders();
	
	/**
	 * Update item quantity.
	 *
	 * @param orderId the order id
	 * @param itemId the item id
	 * @param quantity the quantity
	 * @return the response entity
	 */
	ResponseEntity<Object> updateItemQuantity(Long orderId, Long itemId, Float quantity);
	
	/**
	 * Gets the dispatched orders.
	 *
	 * @return the dispatched orders
	 */
	List<PurchaseOrder> getDispatchedOrders();
	
	/**
	 * Evict cache.
	 */
	void evictCache();
}

