package com.api.procurementsystem.service;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.procurementsystem.AbstractTest;
import com.api.procurementsystem.entity.Category;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.service.item.CatalogueService;
import com.api.procurementsystem.service.item.CategoryService;

public class CategoryServiceTest extends AbstractTest {
	
	@Autowired
	private CategoryService categoryService;
	
	@Before
	public void setUp() {
		categoryService.evictCache();
	}
	
	@After
	public void tearDown() {
		//clean after each test
	}
	
	@Test
	public void testAddItem() {
		Collection<Category> list=categoryService.getAllCategories();
		

		Assert.assertNotNull("failure -expected not null",list);
		Assert.assertEquals("failure -expected size",2,list.size());
	}

}
