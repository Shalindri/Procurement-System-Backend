package com.api.procurementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService;


@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {

	@Autowired
	PurchaseOrderService purchaseOrderService;
	
	@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED, reason= "Purchase Order added")
	public void createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
		purchaseOrderService.createPurchaseOrder(purchaseOrder);
	}
	
	
	@ResponseBody
	 @RequestMapping(value = "", method = RequestMethod.GET)
	 public List<PurchaseOrder> getAllPurchaseOrders() {
	     return purchaseOrderService.getAllPurchaseOrders();
	 }
	
	@ResponseBody
	 @RequestMapping(value = "/{id}/approveOrder", method = RequestMethod.PUT)
	 public ResponseEntity<Object> approveOrder(@PathVariable("id") Long orderId) {
	     return purchaseOrderService.approveOrder(orderId);
	 }
	
	@ResponseBody
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	 public Optional<PurchaseOrder> getOrderById(@PathVariable("id") Long id) {
	     return purchaseOrderService.getOrderById(id);
	 }
	
	@ResponseBody
	 @RequestMapping(value = "/unapproved", method = RequestMethod.GET)
	 public List<PurchaseOrder> getUnApprovedOrders() {
	     return purchaseOrderService.getUnApprovedOrders();
	 }
	
	@ResponseBody
	 @RequestMapping(value = "/dispatched", method = RequestMethod.GET)
	 public List<PurchaseOrder> getDispatchedOrders() {
	     return purchaseOrderService.getDispatchedOrders();
	 }
	
	
	
	
	
	



}
