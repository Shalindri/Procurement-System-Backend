package com.api.procurementsystem.service.purchaseOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.repository.PurchaseOrderRepository;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

	
	@Autowired
	PurchaseOrderRepository purchaseOrderRepository;
	
	@Override
	public void createPurchaseOrder(PurchaseOrder purchaseOrder) {
		
		purchaseOrderRepository.save(purchaseOrder);
		
	}
	
	@Override
    public List<PurchaseOrder> getAllPurchaseOrders(){
        return (List<PurchaseOrder>)purchaseOrderRepository.findAll();
    }
	
	@Override
	public Optional<PurchaseOrder> getOrderById(Long id) {
		return purchaseOrderRepository.findById(id);
	}

	
	
	@Override
	public ResponseEntity<Object> approveOrder(Long orderId) {
		PurchaseOrder  orderObj = purchaseOrderRepository.findById(orderId).get();

		orderObj.setOrder_status("Approved");
		
		purchaseOrderRepository.save(orderObj);

		return ResponseEntity.noContent().build();
	}

	@Override
	public List<PurchaseOrder> getUnApprovedOrders() {
		
		List<PurchaseOrder> orderList =  (List<PurchaseOrder>) purchaseOrderRepository.findAll();
		List<PurchaseOrder> unapproved = new ArrayList<PurchaseOrder>();
		for(PurchaseOrder po:orderList) {
			System.out.println(po.getOrder_status());
			String status= po.getOrder_status();
			
			if(status=="pending") {
			unapproved.add(po);
		}
	}
		return unapproved;
		
		
		
	
	
	
	
	
	}


}
