package com.api.procurementsystem.service;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.procurementsystem.AbstractTest;
import com.api.procurementsystem.entity.Catalogue;
import com.api.procurementsystem.service.item.CatalogueService;


public class ItemServiceTest extends AbstractTest {
	
	@Autowired
	private CatalogueService catalogueService;
	
	@Before
	public void setUp() {
		catalogueService.evictCache();
	}
	
	@After
	public void tearDown() {
		//clean after each test
	}
	
	@Test
	public void testAddItem() {
		Collection<Catalogue> list=catalogueService.getAllItems();
		

		Assert.assertNotNull("failure -expected not null",list);
		Assert.assertEquals("failure -expected size",1,list.size());
	}
	
}
