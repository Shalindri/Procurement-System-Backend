package com.api.procurementsystem.service.purchaseOrder;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;

@Service
public interface PurchaseOrderService {
	void createPurchaseOrder(PurchaseOrder purchaseOrder);
	List<PurchaseOrder> getAllPurchaseOrders();
	ResponseEntity<Object> approveOrder(Long orderId);
	Optional<PurchaseOrder> getOrderById(Long id);
	List<PurchaseOrder> getUnApprovedOrders();
	ResponseEntity<Object> updateItemQuantity(Long orderId, Long itemId, Float quantity);
	List<PurchaseOrder> getDispatchedOrders();
	void evictCache();
}

