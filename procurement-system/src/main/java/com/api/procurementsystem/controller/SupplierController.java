package com.api.procurementsystem.controller;


import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.Supplier;
import com.api.procurementsystem.service.supplier.SupplierService;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {
	
	@Autowired
	SupplierService supplierService;
	
	@ResponseBody
	 @RequestMapping(value = "/{id}/orders", method = RequestMethod.GET)
	 public Set<PurchaseOrder> getOrderBySupplier(@PathVariable("id") Long supplierId) {
	     return supplierService.getOrdersBySupplier(supplierId);
	 }
	@RequestMapping(value = "/addSupplier", method = RequestMethod.POST)
	public void addSupplier(@RequestBody Supplier supplier) {
		supplierService.addSupplier(supplier);
	}
	
	@ResponseBody
	 @RequestMapping(value = "/orders/dispatchOrder", method = RequestMethod.PUT)
	 public ResponseEntity<Object> approveOrder(@RequestBody PurchaseOrder purchaseOrder ) {
	     return supplierService.dispatchOrder(purchaseOrder);
	 }

}
