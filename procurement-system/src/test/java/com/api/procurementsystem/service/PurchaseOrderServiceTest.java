package com.api.procurementsystem.service;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.procurementsystem.AbstractTest;
import com.api.procurementsystem.entity.Catalogue;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.service.purchaseOrder.PurchaseOrderService;

public class PurchaseOrderServiceTest extends AbstractTest {

	@Autowired
	private PurchaseOrderService purchaseOrderService;
	
	@Before
	public void setUp() {
		purchaseOrderService.evictCache();
	}
	
	@After
	public void tearDown() {
		//clean after each test
	}
	
	@Test
	public void testAddItem() {
		Collection<PurchaseOrder> list=purchaseOrderService.getAllPurchaseOrders();
		

		Assert.assertNotNull("failure -expected not null",list);
		Assert.assertEquals("failure -expected size",8,list.size());
	}
	
}
