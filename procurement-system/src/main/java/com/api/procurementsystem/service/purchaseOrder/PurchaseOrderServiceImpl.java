package com.api.procurementsystem.service.purchaseOrder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Item;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.repository.PurchaseOrderRepository;
// TODO: Auto-generated Javadoc
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;

/**
 * The Class PurchaseOrderServiceImpl.
 */
@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

	//public static final String ACCOUNT_SID = "AC5ce5be3917975f643c480d4fbc3d3dda";
	//public static final String AUTH_TOKEN = "821486b86dcb96339f8fe10cbc2740cc";
	  /** logger for this class. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/** The purchase order repository. */
	@Autowired
	PurchaseOrderRepository purchaseOrderRepository;
	
	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#createPurchaseOrder(com.api.procurementsystem.entity.PurchaseOrder)
	 */
	@Override
	public void createPurchaseOrder(PurchaseOrder purchaseOrder) {
		
		purchaseOrderRepository.save(purchaseOrder);
		
	}
	
	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#getAllPurchaseOrders()
	 */
	@Override
    public List<PurchaseOrder> getAllPurchaseOrders(){
        return (List<PurchaseOrder>) purchaseOrderRepository.findAll();
    }
	
	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#getOrderById(java.lang.Long)
	 */
	@Override
	public Optional<PurchaseOrder> getOrderById(Long id) {
		return purchaseOrderRepository.findById(id);
	}

	
	
	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#approveOrder(java.lang.Long)
	 */
	@Override
	public ResponseEntity<Object> approveOrder(Long orderId) {
		PurchaseOrder  orderObj = purchaseOrderRepository.findById(orderId).get();

		orderObj.setOrder_status("Approved");
		
		purchaseOrderRepository.save(orderObj);


		return ResponseEntity.noContent().build();
	}
	

	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#getUnApprovedOrders()
	 */
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

	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#updateItemQuantity(java.lang.Long, java.lang.Long, java.lang.Float)
	 */
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

	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#getDispatchedOrders()
	 */
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
	
	/* (non-Javadoc)
	 * @see com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService#evictCache()
	 */
	@Override
	@CacheEvict(
			value="routes",
			allEntries=true)
	public void evictCache() {
		logger.info("> evictCache");
		logger.info("< evictCache");
	}

}
