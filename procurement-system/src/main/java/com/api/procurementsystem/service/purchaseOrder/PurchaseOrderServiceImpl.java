package com.api.procurementsystem.service.purchaseOrder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Item;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.repository.PurchaseOrderRepository;
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

	//public static final String ACCOUNT_SID = "AC5ce5be3917975f643c480d4fbc3d3dda";
	//public static final String AUTH_TOKEN = "821486b86dcb96339f8fe10cbc2740cc";
	
	@Autowired
	PurchaseOrderRepository purchaseOrderRepository;
	
	@Override
	public void createPurchaseOrder(PurchaseOrder purchaseOrder) {
		
		purchaseOrderRepository.save(purchaseOrder);
		
	}
	
	@Override
    public List<PurchaseOrder> getAllPurchaseOrders(){
        return (List<PurchaseOrder>) purchaseOrderRepository.findAll();
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
			if(!status.equals("closed")){
				if(status.equals("pending")){
					unapproved.add(po);
				}
			}
		}
		
		return unapproved;
	}

	@Override
	public ResponseEntity<Object> updateItemQuantity(Long orderId, Long itemId,Float quantity) {
		PurchaseOrder  orderObj = purchaseOrderRepository.findById(orderId).get();
		Set<Item> itemList = new HashSet<Item>();
		
		
		
		for(Item i:itemList) {
			System.out.println(i.getName());
			Long id = i.getId();
			if(id.equals(itemId)){
				i.setQuantity(quantity);
				}
			}
		
		
		purchaseOrderRepository.save(orderObj);

		return ResponseEntity.noContent().build();
	}

	@Override
	public List<PurchaseOrder> getDispatchedOrders() {
		
		List<PurchaseOrder> orderList =  (List<PurchaseOrder>) purchaseOrderRepository.findAll();
		List<PurchaseOrder> dispatched = new ArrayList<PurchaseOrder>();
		for(PurchaseOrder po:orderList) {
			//System.out.println(po.getOrder_status());
			String status= po.getOrder_status();
			if(status.equals("Dispatched")){
				
					dispatched.add(po);
				
			}
	}
		return dispatched;
		
	}

}
