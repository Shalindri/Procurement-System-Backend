package com.api.procurementsystem.service;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.procurementsystem.AbstractTest;
import com.api.procurementsystem.entity.Catalogue;
import com.api.procurementsystem.entity.Supplier;
import com.api.procurementsystem.service.supplier.SupplierService;

public class SupplierServiceTest extends AbstractTest {
	
	@Autowired
	private SupplierService supplierService;
	
	
	@Before
	public void setUp() {
		supplierService.evictCache();
	}
	
	@After
	public void tearDown() {
		//clean after each test
	}
	
	@Test
	public void testAddItem() {
		Collection<Supplier> list=supplierService.getAllSuppliers();
		

		Assert.assertNotNull("failure -expected not null",list);
		Assert.assertEquals("failure -expected size",2,list.size());
	}

}
